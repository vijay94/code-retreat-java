package uk.tw.offboarding.domain;

public enum Grade {
    CONSULTANT_GRADUATE(1,"Consultant Graduate"),
    CONSULTANT(2, "Consultant"),
    SENIOR_CONSULTANT(3, "Senior Consultant"),
    LEAD_CONSULTANT(4, "Lead Consultant"),
    PRINCIPAL_CONSULTANT(5, "Principal Consultant"),
    DIRECTOR(6, "Director")
    ;
    private int ID;
    private String name;

    Grade(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
}
