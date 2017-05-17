package com.example.dhanya.task1;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.StringTokenizer;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.Extramessage);
        TextView nameview=(TextView) findViewById(R.id.nameview);
        TextView mailview=(TextView) findViewById(R.id.mailview);
        TextView numview=(TextView) findViewById(R.id.numview);
        StringTokenizer st=new StringTokenizer(message," ");
        nameview.setText(st.nextToken());
        mailview.setText(st.nextToken());
        numview.setText(st.nextToken());
    }

}
