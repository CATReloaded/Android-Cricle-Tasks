package com.example.contactinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class ContactNumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_num);

        Intent received_intent = getIntent();
        String received_first_name = received_intent.getStringExtra(String.valueOf(R.string.contactName1));
        String received_last_name = received_intent.getStringExtra(String.valueOf(R.string.contactName2));

        EditText number = findViewById(R.id.numberET);
        AppCompatButton numberButton = findViewById(R.id.sendDataButton);

        numberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.NAME,received_first_name+" "+received_last_name);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,number.getText());
                startActivity(intent);
            }
        });
    }
}