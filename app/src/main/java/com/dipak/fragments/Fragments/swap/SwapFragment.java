package com.dipak.fragments.Fragments.swap;

import android.os.Bundle;
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

public class SwapFragment extends Fragment implements View.OnClickListener {

    private Button btnSwap;
    private EditText etfirst,etsecond;
    private TextView tvResult;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_swap_two_numbers, container, false);
        btnSwap=view.findViewById(R.id.btnCheck);
        etfirst=view.findViewById(R.id.etFirst);
        etsecond=view.findViewById(R.id.etSecond);
        tvResult=view.findViewById(R.id.tvResult);

        btnSwap.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        int first=Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());
        SwapViewModel swapViewModel=new SwapViewModel(first,second);
        swapViewModel.swap();


        tvResult.setText(""+swapViewModel.getFirst()+swapViewModel.getSecond());
    }
}