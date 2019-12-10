package com.dipak.fragments.Fragments.automorphic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutomorphicViewModel extends ViewModel {

    private int number;

    public AutomorphicViewModel(int number) {
        this.number = number;
    }

    public String automorphic()
    {
        int auto;
        auto=number*number;

        while (number>0){
            if (number % 10!=auto%10)
                return "Automorphic";
            number/=10;
            auto/=10;
        }
        return "Not Automorphic";
    }
}