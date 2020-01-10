package com.example.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
        EditText editText=findViewById(R.id.sendMessage);
        String message=editText.getText().toString();

        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("Extra_message",message);
        startActivity(intent);
    }

}
