package com.dipak.fragments.Fragments.automorphic;

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

public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private Button btnCheck;
    private TextView tvResult;
    private EditText etNumber;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_automorphic_number, container, false);
        btnCheck=view.findViewById(R.id.btnCheck);
        tvResult=view.findViewById(R.id.tvResult);
        etNumber=view.findViewById(R.id.etAutomorphic);

        btnCheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int automorphic=Integer.parseInt(etNumber.getText().toString());

        AutomorphicViewModel automorphicViewModel=new AutomorphicViewModel(automorphic);
        tvResult.setText(automorphicViewModel.automorphic());

    }
}