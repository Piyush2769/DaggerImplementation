package com.piyushmaheswari.daggerimplementation.dagger;

import com.piyushmaheswari.daggerimplementation.car.Engine;
import com.piyushmaheswari.daggerimplementation.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
