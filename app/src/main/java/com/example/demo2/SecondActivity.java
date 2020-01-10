package com.example.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String message=intent.getStringExtra("Extra_message");
        TextView textView=findViewById(R.id.displayMessage);
        textView.setText(message);

    }
    public void goHome(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}
