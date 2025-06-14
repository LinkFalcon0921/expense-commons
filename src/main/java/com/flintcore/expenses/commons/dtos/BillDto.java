package com.flintcore.expenses.commons.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;

@Builder
public record BillDto(
        double rawAmount,
        double itbis,
        double servicePercent
) {

    @JsonIgnore
    public double getTotal() {
        return rawAmount + itbis + servicePercent;
    }
}
