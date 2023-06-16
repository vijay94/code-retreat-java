package uk.tw.offboarding.domain;

import lombok.Getter;

@Getter
public enum ExitChecklistItem {
    DESK_KEYS(1, "Desk keys", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.COUNTRY, 1),
    FILE_CABINET_KEYS(2, "File cabinet keys", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.COUNTRY, 1),
    ACCESS_CARD(3, "Access card", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.COUNTRY, 1),
    CELL_PHONE(4, "Cell phone", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.COUNTRY, 1),
    SIM_CARD(5, "SIM card", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.COUNTRY, 1),
    LIBRARY_BOOKS(6, "Library books", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.COUNTRY, 1),
    SEZ_CARD(7, "SEZ card", ExitChecklistItemCategory.ADMIN, ExitChecklistItemType.OFFICE, 8),
    LAPTOP(8, "Laptop", ExitChecklistItemCategory.TECHOPS, ExitChecklistItemType.COUNTRY, 1),
    MONITORS(9, "Monitors", ExitChecklistItemCategory.TECHOPS, ExitChecklistItemType.COUNTRY, 1),
    CHARGER(10, "Charger", ExitChecklistItemCategory.TECHOPS, ExitChecklistItemType.COUNTRY, 1),
    RSA_FOB(11, "RSA FOB", ExitChecklistItemCategory.TECHOPS, ExitChecklistItemType.COUNTRY, 1),
    OUTSTANDING_EXPENSES(12, "Outstanding expenses", ExitChecklistItemCategory.FINANCE, ExitChecklistItemType.COUNTRY, 1),
    SODEXO_REIMBURSEMENT(13, "Sodexo reimbursement", ExitChecklistItemCategory.FINANCE, ExitChecklistItemType.COUNTRY, 1),
    EXIT_SURVEY(13, "Exit survey", ExitChecklistItemCategory.PEOPLE_TEAM, ExitChecklistItemType.COUNTRY, 1),
    LEAVE_ENCASHMENT(14, "Leave encashment", ExitChecklistItemCategory.PEOPLE_TEAM, ExitChecklistItemType.COUNTRY, 1),
    GRATUITY(15, "Gratuity", ExitChecklistItemCategory.PEOPLE_TEAM, ExitChecklistItemType.COUNTRY, 1),
    ;
    private int ID;
    private String description;
    private ExitChecklistItemCategory category;
    private ExitChecklistItemType regionType;
    private int regionID;

    ExitChecklistItem(int ID, String description, ExitChecklistItemCategory category, ExitChecklistItemType regionType, int regionID) {
        this.ID = ID;
        this.description = description;
        this.category = category;
        this.regionType = regionType;
        this.regionID = regionID;
    }
}
