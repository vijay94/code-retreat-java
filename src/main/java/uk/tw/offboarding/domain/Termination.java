package uk.tw.offboarding.domain;

import java.util.Date;
import java.util.List;

public class Termination {
    private int ID;
    private Employee employee;
    private Date lastWorkingDate;
    private String reason;
    private Date initiatedOn;
    private TerminationStatus status;
    private List<EmployeeExitChecklistItem> exitChecklist;
}
