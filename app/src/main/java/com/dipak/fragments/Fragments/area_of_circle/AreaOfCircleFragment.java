package com.dipak.fragments.Fragments.area_of_circle;

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

public class AreaOfCircleFragment extends Fragment implements View.OnClickListener {

    private Button btnCal;
    private EditText etRadius;
    private TextView tvResult;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_area_of_circle, container, false);

        final TextView textView = view.findViewById(R.id.tvAreaOfCircle);
        btnCal=view.findViewById(R.id.btnCalculate);
        etRadius=view.findViewById(R.id.etRadius);
        tvResult=view.findViewById(R.id.tvResult);
        btnCal.setOnClickListener(this);
       return view;
    }

    @Override
    public void onClick(View v) {
        double radius=Integer.parseInt(etRadius.getText().toString());
        areaofcircleViewModel area=new areaofcircleViewModel(radius);
        double res=area.operation();
        tvResult.setText("Total area of Circle is:  "+res);
    }
}