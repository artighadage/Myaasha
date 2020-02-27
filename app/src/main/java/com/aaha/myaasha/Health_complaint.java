package com.aaha.myaasha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Health_complaint extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner1, spinner2;
    private Button btn_patient_info_submit;

//    private RadioButton radio_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_complaint);


        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);


      btn_patient_info_submit = (Button) findViewById(R.id.health_info_submit);

        btn_patient_info_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Health_complaint.this, Treatment_Advice.class);
                startActivity(intent);
            }
        });

        // Spinner click listener


        spinner1.setOnItemSelectedListener(this);


        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("-Select Health Complaints-");
        categories.add("Malaria");
        categories.add("Dengue");
        categories.add("Pregnancy");
        categories.add("Cough and Cold");
        categories.add("Allergies & Asthma");
        categories.add("Cancer");
        categories.add("Heart Disease");
        categories.add("Infectious Diseases");
//        categories.add("Item 5");
//        categories.add("Item 6");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter);

        spinner1.setOnItemSelectedListener(this);

//        addListenerOnButton();

    }

//    private void addListenerOnButton() {
//
//        radio_id=(RadioButton)findViewById(R.id.radio_id);
//        radio_id.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });




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
