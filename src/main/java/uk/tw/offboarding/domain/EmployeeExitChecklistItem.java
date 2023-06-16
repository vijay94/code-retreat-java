package uk.tw.offboarding.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class EmployeeExitChecklistItem {
    private int terminationID;
    private ExitChecklistItem exitChecklistItem;
    private boolean isCompleted;
    private Date completedOn;

    public EmployeeExitChecklistItem(int terminationID, ExitChecklistItem exitChecklistItem, boolean isCompleted, Date completedOn) {
        this.terminationID = terminationID;
        this.exitChecklistItem = exitChecklistItem;
        this.isCompleted = isCompleted;
        this.completedOn = completedOn;
    }
}
