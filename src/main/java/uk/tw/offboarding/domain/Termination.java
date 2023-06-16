package uk.tw.offboarding.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Builder
@Setter
public class Termination {
    private int ID;
    private Employee employee;
    private Date lastWorkingDate;
    private String reason;
    private Date initiatedOn;
    private TerminationStatus status;
    private List<EmployeeExitChecklistItem> exitChecklist;
    private String notes;
}
