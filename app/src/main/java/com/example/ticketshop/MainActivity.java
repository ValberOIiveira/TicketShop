package com.example.ticketshop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText edtMeio, edtInteiro;
    private TextView txtResultado;
    private Button btnCalcular;
    private RadioGroup radioGroup;
    private Double extra = 0.0;
    private int checkedId;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.shows, android.R.layout.simple_spinner_item);
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        edtInteiro = findViewById(R.id.edtInteiro);
        edtMeio = findViewById(R.id.edtMeio);
        txtResultado = findViewById(R.id.txt_resultado);
        btnCalcular = findViewById(R.id.btn_calcular);
        radioGroup = findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(checkedId == R.id.radioVip){
                    extra = 60.0;
                }else{
                    extra = 0.0;
                }
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int item = spinner.getSelectedItemPosition();
                try{
                    int qtdMeio = Integer.parseInt(edtMeio.getText().toString());
                    int qtdInteiro = Integer.parseInt(edtInteiro.getText().toString());
                    double valor = extra;

                    switch(item){
                        case 0:
                            valor = valor+40;
                            valor = (valor+qtdMeio/2)+(valor+qtdInteiro);
                        case 1:
                            valor = valor+50;
                            valor = (valor+qtdMeio/2)+(valor+qtdInteiro);
                        case 2:
                            valor = valor+60;
                            valor = (valor+qtdMeio/2)+(valor+qtdInteiro);
                        case 3:
                            valor = valor+70;
                            valor = (valor+qtdMeio/2)+(valor+qtdInteiro);
                    }

                }catch(Exception e){

                }

            }
        });

    }
}


