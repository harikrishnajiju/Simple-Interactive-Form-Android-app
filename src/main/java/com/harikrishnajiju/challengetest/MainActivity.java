package com.harikrishnajiju.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnClick(View view) {
        EditText editFirstName = findViewById(R.id.edtTxtName1);
        EditText editSecondName = findViewById(R.id.edtTxtName2);
        EditText editEmail = findViewById(R.id.edtTxtName3);
        TextView txtFirstName = findViewById(R.id.txtMessage1);
        TextView txtSecondName = findViewById(R.id.txtMessage2);
        TextView txtEmail = findViewById(R.id.txtMessage3);
        String firstName = "First Name: " + editFirstName.getText().toString();
        String secondName = "Second Name: " + editSecondName.getText().toString();
        String eMail = "E-mail: " + editEmail.getText().toString();
        txtFirstName.setText(firstName);
        txtSecondName.setText(secondName);
        txtEmail.setText(eMail);
    }
}