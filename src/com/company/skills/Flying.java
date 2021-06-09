package com.company.skills;

public interface Flying {
    default void fly() {
        System.out.println("Ця істота вмiє літати");
    }
}
