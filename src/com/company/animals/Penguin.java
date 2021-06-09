package com.company.animals;

import com.company.animalTypes.Bird;
import com.company.skills.Floating;
import com.company.skills.LayingEggs;
import com.company.skills.Walking;

public class Penguin extends Bird implements LayingEggs, Floating, Walking {
    public Penguin(){
        System.out.println("Пінгвін:");
        skill();
        swim();
        walk();
        layEggs();
    }
}
