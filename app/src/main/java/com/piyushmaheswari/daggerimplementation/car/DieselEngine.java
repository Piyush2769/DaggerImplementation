package com.piyushmaheswari.daggerimplementation.car;

import android.widget.TextView;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    TextView t;
    TextView td;
    TextView tx;
    TextView tdx;



    @Inject
    public DieselEngine() {}

    @Override
    public void start() {

    }
}
