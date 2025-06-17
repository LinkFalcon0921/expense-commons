package com.flintcore.expenses.commons.utils.strings;


import java.util.Arrays;
import java.util.Objects;

public interface StringCaster {
    static String[] toString(Object... objects) {
        return Arrays.stream(objects)
                .filter(Objects::nonNull)
                .map(Object::toString)
                .toArray(String[]::new);
    }
}
