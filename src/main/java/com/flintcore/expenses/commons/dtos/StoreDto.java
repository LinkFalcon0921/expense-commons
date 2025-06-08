package com.flintcore.expenses.commons.dtos;

import com.flintcore.expenses.commons.stores.EStorePaymentStatus;
import com.flintcore.expenses.commons.stores.EStoreStatus;
import lombok.Builder;

@Builder
public record StoreDto(
        String rnc,
        String name,
        String commercialName,
        String speciality,
        EStoreStatus status,
        EStorePaymentStatus paymentStatus
) {
}
