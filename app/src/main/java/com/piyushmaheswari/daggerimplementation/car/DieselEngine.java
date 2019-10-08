package com.piyushmaheswari.daggerimplementation.car;

import android.widget.TextView;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    TextView t;


    @Inject
    public DieselEngine() {}

    @Override
    public void start() {

    }
}
