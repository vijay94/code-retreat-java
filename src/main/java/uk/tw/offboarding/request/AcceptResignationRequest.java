package uk.tw.offboarding.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AcceptResignationRequest {
    private String notes;
    private Date lastWorkingDay;
}
