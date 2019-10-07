package com.piyushmaheswari.daggerimplementation.dagger;

import com.piyushmaheswari.daggerimplementation.car.Rims;
import com.piyushmaheswari.daggerimplementation.car.Tires;
import com.piyushmaheswari.daggerimplementation.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims()
    {
        return new Rims();
    }

    @Provides
    Tires provideTires()
    {
        Tires tires=new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims,Tires tires)
    {
        return new Wheels(rims,tires);
    }
}

