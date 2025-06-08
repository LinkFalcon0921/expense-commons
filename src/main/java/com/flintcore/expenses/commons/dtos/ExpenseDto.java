package com.flintcore.expenses.commons.dtos;


import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ExpenseDto(
        String ncf,
        LocalDateTime createdAt,
        BillDto bill,
        StoreDto store
) {
}
