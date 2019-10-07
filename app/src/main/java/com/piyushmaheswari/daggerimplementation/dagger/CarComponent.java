package com.piyushmaheswari.daggerimplementation.dagger;

import com.piyushmaheswari.daggerimplementation.MainActivity;
import com.piyushmaheswari.daggerimplementation.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
