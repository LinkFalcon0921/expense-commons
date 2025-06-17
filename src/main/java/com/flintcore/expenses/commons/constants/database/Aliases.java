package com.flintcore.expenses.commons.constants.database;

/**
 * Texto referencia para la asignacion de datos en la base de datos.
 * */
public interface Aliases {

    interface Users {
        String TABLE = "users";

        String ID = "id";
        String NAME = "name";
        String ALIAS = "alias";
        String ROLE_MAPPED = "user";
    }

    interface UserRole {
        String TABLE = "user_roles";

        String ID = "id";
        String role = "role";
        String USER_MAPPED = "id";
    }

    /**
     * Embedded
     * */
    interface Address {
        String EMAIL = "email";
        String PASSWORD = "password";
    }

    interface Expense {
        String TABLE = "expenses";

        // Columns
        String ID = "id";
        String NCF = "ncf";
        String CREATED_AT = "created_at";
        String BILL_ID = "bill_id";
        String STORE_RNC = "store_rnc";
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
        String COMMERCIAL_NAME = "commercial_name";
        String SPECIALITY = "speciality";
        String MAPPED_BY_EXPENSE = "store";
    }

    interface Budget {
        String TABLE = "budgets";
        String ID = "id";
        String AMOUNT = "amount";
    }

    interface BudgetHistory {
        String ID = "id";
        String TABLE = "budget_histories";
//        String AMOUNT_USED = "amount_used";
        String MAPPED_BY_BUDGET = "id";
    }

    interface UserBudgetHistory {
        String TABLE = "user_budget_histories";

        String ID = "id";
        String BUDGET_ID = "budget_id";
        String USER_ID = "user_id";
    }
}
