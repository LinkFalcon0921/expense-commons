package com.flintcore.expenses.commons.dtos.users;

import com.flintcore.expenses.commons.users.EUserRole;
import jakarta.validation.constraints.NotBlank;

public record UserRegistrationDto(
        @NotBlank
        String name,
        String alias,
        @NotBlank
        String email,
        @NotBlank
        String password,
        @NotBlank
        EUserRole role
) {}
