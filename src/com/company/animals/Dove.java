package com.company.animals;

import com.company.animalTypes.Bird;
import com.company.skills.Flying;
import com.company.skills.LayingEggs;
import com.company.skills.Walking;

//голуб
public class Dove extends Bird implements LayingEggs, Flying, Walking {
    public Dove() {
        System.out.println("Голуб:");
        skill();
        layEggs();
        walk();
        fly();
    }
}
