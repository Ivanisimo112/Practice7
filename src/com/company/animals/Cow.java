package com.company.animals;

import com.company.animalTypes.Mammals;
import com.company.skills.Viviparous;
import com.company.skills.Walking;

//корова)))))
public class Cow extends Mammals implements Walking , Viviparous {
    public Cow(){
        System.out.println("Корова:");
        skill();
        born();
        walk();
    }
}
