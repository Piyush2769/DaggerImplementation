package com.piyushmaheswari.daggerimplementation.dagger;

import com.piyushmaheswari.daggerimplementation.car.DieselEngine;
import com.piyushmaheswari.daggerimplementation.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
