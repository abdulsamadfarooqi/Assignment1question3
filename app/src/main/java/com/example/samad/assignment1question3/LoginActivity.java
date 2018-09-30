package com.example.samad.assignment1question3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public Button btnRegister;                    //Declaration of items
    public Button btnLogin;
    public EditText txtPassword;
    public TextView txtViewError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister=findViewById(R.id.btnRegister);          //Relating items with corresponding id
        btnLogin=findViewById(R.id.btnLogin);
        txtPassword=findViewById(R.id.Password);
        txtViewError=findViewById(R.id.txtInvalid);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {                   //Action listener on a button
                if(txtPassword.getText().toString().length()>4)
                {
                    txtViewError.setText("Valid Password");
                    Intent intent =new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else
                {
                    txtViewError.setText("Invalid Email or Password");
                }

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);      //Intent to goto a desired activity
                startActivity(intent);
                finish();
            }
        });
    }
}



