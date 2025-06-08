package com.flintcore.expenses.commons.stores;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EStoreStatus {
    ACTIVE("ACTIVO"),
    SUSPENDED("SUSPENDIDO"),
    TEMPORAL_DOWN("CESE TEMPORAL"),
    REJECTED("RECHAZADO"),
    CANCELED("ANULADO"),
    DOWN("DADO DE BAJA");

    private final String key;

    public static EStoreStatus fromValue(String value) {
        for (EStoreStatus status : values()) {
            if (status.key.equalsIgnoreCase(value) || status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        System.out.printf("Not valid status for business: %s%n", value);
        return SUSPENDED;
    }
}
