package com.flintcore.expenses.commons.constants.database;

public interface NFCConstants {
    int MINIMUM_LENGTH = 11,
            FULL_SIZE_START_SIZE = 3,
            SIZE_START_SIZE = 1,
    NUMERIC_SECTION_SIZE = MINIMUM_LENGTH - FULL_SIZE_START_SIZE;
}
