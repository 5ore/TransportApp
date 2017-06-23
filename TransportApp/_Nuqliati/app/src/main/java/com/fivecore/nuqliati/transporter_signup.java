package com.fivecore.nuqliati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class transporter_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporter_signup);

        Spinner countrySelector = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> spinnerAdapter =
                ArrayAdapter.createFromResource(this,R.array.countries_array,
                        android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        countrySelector.setAdapter(spinnerAdapter);

    }
}
