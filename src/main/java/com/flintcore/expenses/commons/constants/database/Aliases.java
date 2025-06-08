package com.flintcore.expenses.commons.constants.database;

/**
 * Texto referencia para la asignacion de datos en la base de datos.
 * */
public interface Aliases {

    interface Expense {
        String TABLE = "expenses";

        // Columns
        String ID = "id";
        String NCF = "ncf";
        String CREATED_AT = "created_at";
        String BILL_ID = "bill_id";
        String STORE_ID = "store_id";
        String MAPPED_BY_STORE = "id";
    }

    interface Bill {
        String TABLE = "bills";

        // Columns
        String ID = "id";
        String AMOUNT = "amount";
        String ITBIS = "itbis";
        String SERVICE_PERCENT = "service_percent";
        String MAPPED_BY_EXPENSE = "bill";
    }

    interface Store {
        String TABLE = "stores";
        String ID = "id";
        String RNC = "rnc";
        String NAME = "name";
        String MAPPED_BY_EXPENSE = "store";
    }

    interface Budget {
        String TABLE = "budgets";
        String ID = "id";
        String AMOUNT = "amount";
    }

    interface BudgetHistory {
        String ID = "id";
        String TABLE = "budget-histories";
//        String AMOUNT_USED = "amount_used";
        String MAPPED_BY_BUDGET = "id";
    }
}
