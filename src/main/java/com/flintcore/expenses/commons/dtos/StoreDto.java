package com.flintcore.expenses.commons.dtos;

import lombok.Builder;

@Builder
public record StoreDto(
        String name,
        String rnc
) {
}
