package com.dipak.fragments.Fragments.swap;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SwapViewModel extends ViewModel {

    private int first,second;

    public SwapViewModel(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void swap()
    {
        first=first+second;
        second=first-second;
        first=first-second;

        setFirst(first);
        setSecond(second);
    }
}