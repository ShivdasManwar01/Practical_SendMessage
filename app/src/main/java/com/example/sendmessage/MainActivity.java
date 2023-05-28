package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mess,phone;
    Button sendbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mess=findViewById(R.id.mess);
        phone=findViewById(R.id.phone);
        sendbtn=findViewById(R.id.sendbtn);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.putExtra("address",new String[]{phone.getText().toString()});
                intent.putExtra("message",mess.getText().toString());
                intent.setType("vnd.android-dir/mms-sms");
                startActivity(intent);

            }
        });

    }
}