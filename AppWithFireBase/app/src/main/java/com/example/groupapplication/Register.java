package com.example.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    Button cancel;
    Button confirm;
    EditText enterName;
    EditText enterPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        cancel = findViewById(R.id.cancel);
        confirm = findViewById(R.id.confirm);
        enterName=findViewById(R.id.enterName);
        enterPw=findViewById(R.id.enterPw);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = enterName.getText().toString();
                String pw = enterPw.getText().toString();
                openActivityMain(name,pw);
            }
        });
    }

    public void openActivityMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openActivityMain(String name,String pw){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("keyName",name);
        intent.putExtra("keyPw",pw);
        startActivity(intent);
    }
}
