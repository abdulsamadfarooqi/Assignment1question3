package com.example.samad.assignment1question3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText Fname,Lname,Email,Password,CPassword;
    private String firstN,lastN, email, pwd, cpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Fname = (EditText) findViewById(R.id.FName);
        Lname = (EditText) findViewById(R.id.LName);
        Email = (EditText) findViewById(R.id.EMAIL);
        Password = (EditText) findViewById(R.id.PASSWORD);
        CPassword = (EditText) findViewById(R.id.confirmPassword);
    }

    public void registerNow(View view) {
        if( validateFields() ){
            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }
    }

    private boolean validateFields() {
        boolean validate = true;

        firstN = Lname.getText().toString();
        lastN = Lname.getText().toString();
        email = Email.getText().toString();
        pwd = Password.getText().toString();
        cpwd = CPassword.getText().toString();


        
        if( firstN.isEmpty() )
        {
            validate = false;
            Fname.setError( "Required Field!" );
        }else
            Fname.setError( null );

        if( lastN.isEmpty() )
        {
            validate = false;
            Lname.setError( "Required Field!" );
        }else
            Lname.setError( null );

        if( email.isEmpty() )
        {
            validate = false;
            Email.setError( "Required Field!" );
        }else
            Email.setError( null );

        if( pwd.isEmpty() )
        {
            validate = false;
            Password.setError( "Required Field!" );
        }else
            Password.setError( null );

        if( cpwd.isEmpty() )
        {
            validate = false;
            CPassword.setError( "Required Field!" );
        } else
            CPassword.setError( null );


        if( !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches() )
        {
            validate = false;
            Email.setError( "Please enter valid Email!!" );
        } else
            Email.setError( null );

        if(pwd.length() <= 4){
            validate = false;
            Password.setError( "Atleast 5 digits!" );

        } else
            Password.setError( null );

        if (!cpwd.matches(pwd)){
            validate = false;
            CPassword.setError( "Passwords do not match" );
        }else
            CPassword.setError( null );

        return validate;
    }
}

