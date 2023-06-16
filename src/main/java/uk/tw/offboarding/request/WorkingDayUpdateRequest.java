package uk.tw.offboarding.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class WorkingDayUpdateRequest {
    private Date lastWorkingDay;
}
