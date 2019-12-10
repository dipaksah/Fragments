package com.dipak.fragments.Fragments.palindrome;

import android.icu.util.EthiopicCalendar;
import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.dipak.fragments.R;

public class PalindromeFragment extends Fragment implements View.OnClickListener {

    private Button btnCheck;
    private EditText etNumber;
    private TextView tvResult;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_palindrone, container, false);
        btnCheck=view.findViewById(R.id.btnCheck1);
        etNumber=view.findViewById(R.id.etPalindrome);
        tvResult=view.findViewById(R.id.tvResult1);
        btnCheck.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        int palin=Integer.parseInt(etNumber.getText().toString());
        PalindromeViewModel palindromeViewModel=new PalindromeViewModel(palin);

        tvResult.setText(palindromeViewModel.palindrome());
    }
}