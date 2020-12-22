package com.example.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddMedicine extends AppCompatActivity {
    Button cancel;
    Button add;
    EditText medName;
    EditText medDos;
    EditText medTime;
    EditText medTimes;
    String name="";
    String dosage="";
    String time="";
    String times="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);
        cancel = findViewById(R.id.cancel);
        medName = findViewById(R.id.medName);
        medDos = findViewById(R.id.medDos);
        medTime = findViewById(R.id.medTime);
        medTimes = findViewById(R.id.medTimes);
        add = findViewById(R.id.add);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHome();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=medName.getText().toString();
                dosage=medDos.getText().toString();
                time=medTime.getText().toString();
                times=medTimes.getText().toString();
                String coly="\t\t\t"+name+"\t\t\t\t\t\t\t\t\t\t\t"+dosage+"\t\t\t\t\t\t\t\t\t\t\t"+time;
                addMeds(coly);
            }
        });
    }
    public void openActivityHome(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
    public void addMeds(String coly){
        Intent intent = new Intent(this,MedicineList.class);
        intent.putExtra("keyMed",coly);
        startActivity(intent);
    }
}
