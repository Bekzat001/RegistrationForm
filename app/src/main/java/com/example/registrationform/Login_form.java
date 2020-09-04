package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;

public class Login_form extends AppCompatActivity {
    Button btn_register;
    EditText textEmailAddress, textPassword;
    /*EditText txtEmail, txtPassword, txtConfirmPassword;
    Button btn_register;
    ProgressBar progressBar;
    */
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");

/*      txEmail = (EditText) findViewById(R.id.txt_email);
        txtPassword = (EditText) findViewById(R.id.txt_password);
        txtConfirmPassword = (EditText) findViewById(R.id.txt_confirm_password);
        btn_register = (Button) findViewById(R.Id(buttonRegister);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);*/
        firebaseAuth = FirebaseAuth.getInstance();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = textEmailAddress.getText().toString().trim();
                String password = textPassword.getText().toString().trim();
            }
        });

    }


    public void btn_signupForm(View view) {

        startActivity(new Intent(getApplicationContext(),Signup_Form.class));
    }
}