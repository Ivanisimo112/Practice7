package com.company.skills;

public interface Walking {
    default void walk(){
        System.out.println("Ця істота вміє ходити");
    }
}
