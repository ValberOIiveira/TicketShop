package com.example.ticketshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText edtMeio, edtInteiro;
    private TextView txtResultado;
    private Button btnCalcular;
    private RadioGroup radioGroup;
    private Double extra = 0.0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter adapter <ArrayAdapter.createFromResource(this,R.array.shows, android.R.layout.simple_spinner_item);
        spinner = findViewById((R.id.spinner);
        spinner.setAdapter();



    }
}