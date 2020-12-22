package com.example.groupapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView warn;
    EditText editUsername;
    EditText editPw;
    Button login;
    Button signup;

    String bunName="";
    String bunPw="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        warn = findViewById(R.id.warn);
        editUsername = findViewById(R.id.editUsername);
        editPw = findViewById(R.id.editPw);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            bunName=extras.getString("keyName");
            bunPw=extras.getString("keyPw");
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                warn.setText("");
                String inhUn = editUsername.getText().toString();
                String inhPw = editPw.getText().toString();
                if(inhUn.equals("") && inhPw.equals("")) {
                    warn.setText("Empty username and password");
                }else if(inhPw.equals("")) {
                    warn.setText("Empty Password");

                }else if(inhUn.equals("")){
                    warn.setText("Empty username");

                }else if(inhUn.equals(bunName) && inhPw.equals(bunPw)){
                    openActivityHome(inhUn);//the main page
                }else{
                    warn.setText("Wrong username or password");
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityReg();
            }
        });
    }

    public void openActivityReg(){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

    public void openActivityHome(String un){
        Intent intent = new Intent(this,HomePage.class);
        intent.putExtra("keyUn",un);
        startActivity(intent);
    }
}
