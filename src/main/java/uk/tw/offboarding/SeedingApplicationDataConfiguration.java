package uk.tw.offboarding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.tw.offboarding.domain.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Configuration
public class SeedingApplicationDataConfiguration {

    @Bean
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        int index = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse("2018-12-01");
        } catch (Exception e) {
            date = new Date();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        for (Office office: Office.values()) {
            for (Role role: Role.values()) {
                for (Grade grade: Grade.values()) {
                    Employee employee = new Employee();
                    employee.setID(++index);
                    employee.setGrade(grade);
                    employee.setName("Employee "+index);
                    employee.setOffice(office);
                    employee.setRole(role);
                    cal.add(Calendar.DAY_OF_MONTH, 1);
                    employee.setHireDate(cal.getTime());
                    employees.add(employee);
                }
            }
        }
        return employees;
    }

    @Bean
    public List<Termination> getResignations() {
        List<Termination> terminationList = new ArrayList<>();
        try {
            Termination termination = Termination.builder()
                    .ID(1)
                    .reason("Resignation")
                    .employee(getEmployees().get(0))
                    .lastWorkingDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01"))
                    .status(TerminationStatus.SUBMITTED)
                    .build();
            terminationList.add(termination);

            Termination termination1 = Termination.builder()
                    .ID(2)
                    .reason("Resignation")
                    .employee(getEmployees().get(1))
                    .lastWorkingDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-02"))
                    .status(TerminationStatus.SUBMITTED)
                    .build();
            terminationList.add(termination1);
        } catch (Exception e){

        }
        return terminationList;
    }
}
