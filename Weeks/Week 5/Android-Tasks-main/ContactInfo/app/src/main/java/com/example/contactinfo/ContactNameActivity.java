package com.example.contactinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ContactNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_name);


        EditText first_name = findViewById(R.id.firstNameET);
        EditText last_name = findViewById(R.id.lastNameET);
        AppCompatButton nameButton = findViewById(R.id.sendNameButton);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ContactNumActivity.class);
                intent.putExtra(String.valueOf(R.string.contactName1),first_name.getText().toString());
                intent.putExtra(String.valueOf(R.string.contactName2),last_name.getText().toString());
                startActivity(intent);
            }
        });

    }

}