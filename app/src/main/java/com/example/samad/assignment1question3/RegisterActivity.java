package com.example.samad.assignment1question3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText FName,LName,Email,Password,CPassword;             //Declaration of items
        FName=findViewById(R.id.FName);

        LName=findViewById(R.id.LName);//relating items with corresponding id

        Email=findViewById(R.id.Email);

        Password=findViewById(R.id.Password);

        CPassword=findViewById(R.id.confirmPassword);


        final String fname,lname,email,password,cpassword;            // Declaration of strings
        fname=FName.getText().toString();
        lname=LName.getText().toString();
        email=Email.getText().toString();                             //getting text from items into string
        password=Password.getText().toString();
        cpassword=CPassword.getText().toString();



        FName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (FName.getText().length()<1){
                    FName.setError("Cannot Leave Empty ");
                }
            }
        });
        LName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (FName.getText().length()<1){
                    FName.setError("Cannot Leave Empty ");
                }
            }
        });
        Email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (FName.getText().length()<1){
                    FName.setError("Cannot Leave Empty ");
                }
            }
        });
        Password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (FName.getText().length()<1){
                    FName.setError("Cannot Leave Empty ");
                }
            }
        });
        CPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (FName.getText().length()<1){
                    FName.setError("Cannot Leave Empty ");
                }
            }
        });



        Button btnConfirm;
        btnConfirm=findViewById(R.id.Confirm);                        //Action listener on a button
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if(Password.equals(CPassword)) {

                        Toast toast = Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_SHORT);
                        toast.show();
                        Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Not Registered", Toast.LENGTH_SHORT);
                        toast.show();
                    }

            }
        });



    }
}
