package com.example.dhanya.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public static final String Extramessage="hai hello";


    EditText text1,text2,text3;
    Button send;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {

       // Toast.makeText(getApplicationContext(),"hai you click send",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,Main2Activity.class);
        text1=(EditText) findViewById(R.id.name);
        text2=(EditText) findViewById(R.id.mail);
        text3=(EditText) findViewById(R.id.num);
        String name=text1.getText().toString();
        if(name.length()==0) {
            Toast.makeText(getApplicationContext(),"name should not be empty",Toast.LENGTH_SHORT).show();
            return;
        }
        String mail=text2.getText().toString();
        if(mail.length()==0) {
            Toast.makeText(getApplicationContext(),"mail should not be empty",Toast.LENGTH_SHORT).show();
            return;
        }
        String email = text2.getText().toString().trim();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

// onClick of button perform this simplest code.
        if (email.matches(emailPattern))
        {
            //Toast.makeText(getApplicationContext(),"valid email address",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
            text2.setText("");
            return;
        }
        String num=text3.getText().toString();
        if(num.length()==0) {
            Toast.makeText(getApplicationContext(),"number should not be empty",Toast.LENGTH_SHORT).show();
            return;
        }
        String MobilePattern = "[0-9]{10}";
        if(num.matches(MobilePattern))
        {

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Invalid phone number", Toast.LENGTH_SHORT).show();
            text3.setText("");
            return;
        }
        intent.putExtra(Extramessage,name+" "+mail+" "+num);
        startActivity(intent);
    }
}
