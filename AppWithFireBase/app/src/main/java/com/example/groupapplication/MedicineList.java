package com.example.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MedicineList extends AppCompatActivity {
    Button cancel;
    String med="";
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_list);
        cancel = findViewById(R.id.cancel);
        checkBox = findViewById(R.id.checkBox);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            med=extras.getString("keyMed");
        }
        checkBox.setText(med);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHome();
            }
        });
    }
    public void openActivityHome(){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
}
