package com.aaha.myaasha;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Treatment_Advice extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment__advice);


        Button selectDate = findViewById(R.id.btnDate);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);


        // Spinner click listener

        spinner1.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("-Select Type of TB-");
        categories.add("Active TB");
        categories.add("Latent TB");
        categories.add("Miliary TB");
        categories.add("Drug Resistant TB");
//        categories.add("Item 5");
//        categories.add("Item 6");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter);

        final TextView date = findViewById(R.id.tvSelectedDate);


        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(Treatment_Advice.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                Toast.makeText(Treatment_Advice.this, year + "", Toast.LENGTH_SHORT).show();
                                date.setText(day + "/" + month + "/" + year);
                            }
                        }, 0, 0, 0);
                datePickerDialog.updateDate(2020, 1, 1);
                datePickerDialog.show();
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


