package com.dipak.fragments.Fragments.palindrome;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PalindromeViewModel extends ViewModel {

    private int number;

    public PalindromeViewModel(int number) {
        this.number = number;
    }

    public String palindrome()
    {
        int res;
        int sum=0;
        int temp;
        temp=number;
        while (number>0){
            res=number%10;
            sum=(sum*10)+res;
            number=number/10;
        }
        if (temp==sum)
        {
            return "Palindrome Number";
        }else
            return "not a palindrome numbre";
    }
}