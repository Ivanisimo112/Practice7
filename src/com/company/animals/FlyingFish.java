package com.company.animals;

import com.company.animalTypes.Fish;
import com.company.skills.Floating;
import com.company.skills.Flying;
import com.company.skills.LayingEggs;

public class FlyingFish extends Fish implements Flying, LayingEggs, Floating {
    public FlyingFish(){
        System.out.println("Летюча риба:");
        skill();
        layEggs();
        fly();
    }
}
