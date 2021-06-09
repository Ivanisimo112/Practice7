package com.company.skills;

public interface LayingEggs {
    default void layEggs(){
        System.out.println("Ця істота відкладає яйця або ікру");
    }
}
