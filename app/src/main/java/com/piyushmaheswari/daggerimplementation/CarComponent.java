package com.piyushmaheswari.daggerimplementation;

import dagger.Component;

@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
