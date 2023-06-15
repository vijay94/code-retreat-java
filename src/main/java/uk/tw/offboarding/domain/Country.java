package uk.tw.offboarding.domain;

public enum Country {
    UNITED_KINGDOM(1,"United Kingdom", "GBR", Status.ACTIVE),
    UNITED_STATES(2, "United States", "USA", Status.ACTIVE),
    AUSTRALIA(3, "Australia", "AUS", Status.ACTIVE),
    INDIA(4, "India", "IND", Status.ACTIVE),
    GERMANY(5, "Germany", "DEU", Status.ACTIVE),
    CHINA(6, "China", "CHN", Status.ACTIVE),
    BRAZIL(7, "Brazil", "BRA", Status.ACTIVE),
    CANADA(8, "Canada", "CAN", Status.CLOSED)
    ;
    private int ID;
    private String name;
    private String iso3Code;
    private Status status;

    Country(int ID, String name, String iso3Code, Status status) {
        this.ID = ID;
        this.name = name;
        this.iso3Code = iso3Code;
        this.status = status;
    }
}
