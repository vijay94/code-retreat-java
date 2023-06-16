package uk.tw.offboarding.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class
Employee {
    private int ID;
    private String name;
    private Role role;
    private Grade grade;
    private Office office;
    private Date hireDate;
}
