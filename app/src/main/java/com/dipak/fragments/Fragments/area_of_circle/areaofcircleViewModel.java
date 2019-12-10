package com.dipak.fragments.Fragments.area_of_circle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class areaofcircleViewModel extends ViewModel {

    private double radius;

    public areaofcircleViewModel(double radius) {
        this.radius = radius;
    }

    public double operation() {
        double pie=3.14;
        double result=0;
        result=((radius*radius)*pie);
        return result;
    }
}