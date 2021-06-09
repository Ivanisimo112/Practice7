package com.company.animals;
//акваріумна рибка

import com.company.animalTypes.Fish;
import com.company.skills.Floating;
import com.company.skills.Flying;
import com.company.skills.Viviparous;

public class Guppy extends Fish implements Viviparous, Floating {
    public Guppy(){
        System.out.println("Aкваріумна риба:");
        skill();
        swim();
        born();
    }
}
