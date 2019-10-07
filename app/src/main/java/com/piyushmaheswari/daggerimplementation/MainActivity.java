package com.piyushmaheswari.daggerimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.piyushmaheswari.daggerimplementation.car.Car;
import com.piyushmaheswari.daggerimplementation.dagger.CarComponent;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component=DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}
