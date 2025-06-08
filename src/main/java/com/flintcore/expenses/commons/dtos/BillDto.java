package com.flintcore.expenses.commons.dtos;

import lombok.Builder;

@Builder
public record BillDto(
        double rawMonto,
        double itbis,
        double servicePercent,
        String expenseId
) {

    public double getTotal() {
        return rawMonto + itbis + servicePercent;
    }
}
