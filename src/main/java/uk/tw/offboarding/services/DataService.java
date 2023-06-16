package uk.tw.offboarding.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.tw.offboarding.SeedingApplicationDataConfiguration;
import uk.tw.offboarding.domain.*;
import uk.tw.offboarding.request.AcceptResignationRequest;
import uk.tw.offboarding.request.WorkingDayUpdateRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DataService {

    private List<Employee> employees;

    private List<Termination> terminations;

    SeedingApplicationDataConfiguration seedingApplicationDataConfiguration;

    @Autowired
    public DataService(SeedingApplicationDataConfiguration seedingApplicationDataConfiguration) {
        this.employees = seedingApplicationDataConfiguration.getEmployees();
        this.terminations = seedingApplicationDataConfiguration.getResignations();
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public List<Termination> getTerminations() {
        return terminations;
    }

    public void updateTermination(int terminationId, WorkingDayUpdateRequest workingDayUpdateRequest) throws Exception {
        Termination termination = getTermination(terminationId);
        termination.setLastWorkingDate(workingDayUpdateRequest.getLastWorkingDay());
    }

    private Termination getTermination(int terminationId) throws Exception {
        var terminations = this.terminations.stream().filter(t -> t.getID() == terminationId).toList();
        if (terminations.size() == 0) {
            throw new Exception("Termination not found");
        }
        Termination termination = terminations.get(0);
        return termination;
    }

    public void acceptTermination(int terminationId, AcceptResignationRequest acceptResignationRequest) throws Exception {
        Termination termination = getTermination(terminationId);
        if (acceptResignationRequest.getLastWorkingDay() != null) {
            termination.setLastWorkingDate(acceptResignationRequest.getLastWorkingDay());
        }

        termination.setNotes(acceptResignationRequest.getNotes());
        termination.setStatus(TerminationStatus.ACCEPTED);

        addExitCheckList(termination);
    }

    private void addExitCheckList(Termination termination) {
        Country country = termination.getEmployee().getOffice().getCountry();
        List<ExitChecklistItem> exitChecklistItems = Arrays.stream(ExitChecklistItem.values()).filter(exitChecklistItem -> exitChecklistItem.getRegionID() == country.getID()).toList();
        List<EmployeeExitChecklistItem> employeeExitChecklistItems = new ArrayList<>();
        exitChecklistItems.forEach(exitChecklistItem -> {
            employeeExitChecklistItems.add(EmployeeExitChecklistItem.builder()
                            .isCompleted(false)
                            .exitChecklistItem(exitChecklistItem)
                            .terminationID(termination.getID())
                    .build());
        });
        termination.setExitChecklist(employeeExitChecklistItems);
    }
}
