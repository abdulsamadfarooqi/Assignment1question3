package com.example.samad.assignment1question3;


import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public Button btnRegister;                    //Declaration of items
    public Button btnLogin;
    public EditText txtPassword;
    public EditText txtEmail;
    public TextView txtViewError;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister=findViewById(R.id.btnRegister);          //Relating items with corresponding id
        btnLogin=findViewById(R.id.btnLogin);
        txtPassword=findViewById(R.id.Password);
        txtViewError=findViewById(R.id.txtInvalid);
        txtEmail=findViewById(R.id.Email);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {                   //Action listener on a button
                if(txtPassword.getText().toString().length()>4 || android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches() )
                {
                    txtViewError.setText("Valid Password");
                    Intent intent =new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else if(txtEmail.getText().toString().isEmpty()||txtPassword.getText().toString().isEmpty()) {
                    txtPassword.setError("Field is empty");
                    txtEmail.setError("Field is empty");
                    txtViewError.setText("Cannot Login");
                }
                else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    txtEmail.setError("Please enter valid Email!!");
                } else {
                    txtEmail.setError(null);
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



