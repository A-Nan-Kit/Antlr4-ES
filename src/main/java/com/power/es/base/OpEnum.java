package com.power.es.base;

import lombok.Getter;

import java.util.Objects;

/**
 * @author A_Nan
 */
public enum OpEnum {
    LT("lt","<"),
    GT("gt",">"),
    LE("le","<="),
    GE("ge",">="),
    AND("and","AND"),
    OR("or","OR"),
    ;

    @Getter
    private String key;
    @Getter
    private String value;

    OpEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static OpEnum getByKey(String key) {
        for (OpEnum e : values()) {
            if (Objects.equals(key, e.key)) {
                return e;
            }
        }
        return null;
    }

    public static OpEnum getByValue(String value) {
        for (OpEnum e : values()) {
            if (Objects.equals(value,e.value)) {
                return e;
            }
        }
        return null;
    }

}
