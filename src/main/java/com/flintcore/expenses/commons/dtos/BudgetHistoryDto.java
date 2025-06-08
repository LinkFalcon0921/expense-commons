package com.flintcore.expenses.commons.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public record BudgetHistoryDto(
        double amountUsed,
        double previousAmount,
        LocalDate createdAt,
        BudgetDto budget
) {
    private static final double EMPTY_AMOUNT = BigDecimal.ZERO.doubleValue();

    public static BudgetHistoryDto empty(BudgetDto budget) {
        return new BudgetHistoryDto(EMPTY_AMOUNT, budget.amount(), LocalDate.now(), budget);
    }

    public BudgetHistoryDto(double amountUsed, LocalDate createdAt, BudgetDto budget) {
        this(amountUsed, EMPTY_AMOUNT, createdAt, budget);
    }

    public BudgetHistoryDto withPrevious(double amountPrevious) {
        return new BudgetHistoryDto(amountUsed, amountPrevious, createdAt, budget);
    }

    /**
     * Gets the available amount for the budget.
     * Maybe null.
     */
    public double getRemainingAmount() {
        if (Objects.isNull(budget)) {
            return amountUsed;
        }

        return previousAmount + budget.amount() - amountUsed;
    }
}
