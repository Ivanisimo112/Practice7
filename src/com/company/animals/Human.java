package com.company.animals;

import com.company.animalTypes.Mammals;
import com.company.skills.Floating;
import com.company.skills.Viviparous;
import com.company.skills.Walking;

public class Human extends Mammals implements Floating, Walking, Viviparous {
    public Human(){
        System.out.println("Людина:");
        skill();
        swim();
        walk();
        born();
    }
}
