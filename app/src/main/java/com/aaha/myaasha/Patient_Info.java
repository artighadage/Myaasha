package com.aaha.myaasha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Patient_Info extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spinner1, spinner2,spinner,spinner4;
    Button patient_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient__info);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
       Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

      Spinner  spinner=(Spinner) findViewById(R.id.spinner);
        Spinner  spinner4=(Spinner) findViewById(R.id.spinner4);

        patient_submit = findViewById(R.id.patient_submit);


        patient_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Patient_Info.this, Treatment_Advice.class);
                startActivity(intent);
            }
        });

        // Spinner click listener
        spinner1.setOnItemSelectedListener(this);


        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("-Select District-");
        categories.add("Mumbai");
        categories.add("Thane");
        categories.add("Raigad");
        categories.add("Navi Mumbai");
//        categories.add("Item 5");
//        categories.add("Item 6");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter);

        spinner1.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String>  Area= new ArrayList<String>();
        Area.add("-Select Area-");
        Area.add("Airoli");
        Area.add("Belapur");
        Area.add("Ghansoli");
        Area.add("Juinagar");
        Area.add("Mahape");
        Area.add("Panvel");
        Area.add("Vashi");
        Area.add("Sanpada");
//        categories.add("Item 5");
//        categories.add("Item 6");

        // Creating adapter for spinner
        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Area);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter);


        spinner1.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> ms = new ArrayList<String>();

        ms.add("Mr.");
        ms.add("Mrs.");
        ms.add("Ms.");

//        categories.add("Item 5");
//        categories.add("Item 6");

        // Creating adapter for spinner
        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ms);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // Spinner Drop down elements
        List<String> kyc = new ArrayList<String>();

        kyc.add("-KYC-");
        kyc.add("Aadhar No.");
        kyc.add("PAN");
        kyc.add("Driving License");
        kyc.add("Other Kyc");

//        categories.add("Item 5");
//        categories.add("Item 6");

        // Creating adapter for spinner
        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, kyc);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner4.setAdapter(dataAdapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
       // String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
      //  Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    }




