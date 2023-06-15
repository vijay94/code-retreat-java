package uk.tw.offboarding.domain;

public enum Role {
    DEVELOPER(1,"Developer"),
    QUALITY_ANALYST(2, "Quality Analyst"),
    BUSINESS_ANALYST(3, "Business Analyst"),
    PRODUCT_MANAGER(4, "Product Manager"),
    PROJECT_MANAGER(5, "Project Manager"),
    UI_DEVELOPER(6, "UI Developer"),
    EXPERIENCE_DESIGNER(7, "Experience Designer"),
    MOBILE_DEVELOPER(8, "Mobile Developer"),
    DATA_ENGINEER(9, "Data Engineer"),
    DATA_SCIENTIST(10, "Data Scientist"),
    INFRA_CONSULTANT(11, "Infra Consultant");
    private String name;
    private int ID;

    Role(int ID, String name) {
        this.name = name;
        this.ID = ID;
    }
}
