package com.flintcore.expenses.commons.constants.database;

public interface SQLExpressions {
    interface Budget {
        String GET_EXPENSE_SUM_AMOUNT_FOR_HISTORY = """
                (SELECT SUM(b.amount) FROM bills b WHERE b.id =
                (SELECT e.bill_id FROM expenses e WHERE e.bill_id = b.id AND e.created_at = created_at))
                """;
    }
}
