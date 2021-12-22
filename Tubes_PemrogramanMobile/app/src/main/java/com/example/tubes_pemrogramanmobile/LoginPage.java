package com.example.tubes_pemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText email, password;
    TextView register;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email= findViewById(R.id.editTextTextPersonName);
        password= findViewById(R.id.editTextTextPersonName2);
        submit=findViewById(R.id.button);
        register=findViewById(R.id.register);

//        String Email = email.getText().toString();
//        String Password = password.getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(email.getText().toString().isEmpty() && password.getText().toString().isEmpty()){

                    Toast.makeText(getApplicationContext(),"Email atau Password belum diisi !!!",Toast.LENGTH_LONG).show();

                }
                if(email.getText().toString().equals("user") && password.getText().toString().equals("abc")){

                    Intent intent= new Intent(LoginPage.this, Home.class);
                    startActivity(intent);
                    finish();
                }
                else{

                    Toast.makeText(getApplicationContext(),"Email atau Password salah !!!",Toast.LENGTH_LONG).show();
                }
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(LoginPage.this, RegisterAccount.class);
                startActivity(intent2);
                finish();
            }
        });






    }
}