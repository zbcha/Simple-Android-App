package com.example.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    String usr="";
    TextView welPg;
    Button logout;
    Button add;
    Button list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        welPg = findViewById(R.id.welPg);
        logout = findViewById(R.id.logout);
        add = findViewById(R.id.add);
        list = findViewById(R.id.list);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            usr=extras.getString("keyUn");
        }
        welPg.setText("Welcome "+usr+"!");
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAdd();
            }
        });
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityList();
            }
        });
    }

    public void openActivityMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void openActivityAdd(){
        Intent intent = new Intent(this,AddMedicine.class);
        startActivity(intent);
    }
    public void openActivityList(){
        Intent intent = new Intent(this,MedicineList.class);
        startActivity(intent);
    }
}
