package com.example.demo2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int message_request = 1;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.displayMessage);


    }

    public void getMessage(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivityForResult(intent,message_request);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(message_request==requestCode)
        {
            if(resultCode==RESULT_OK)
            {
                String message = data.getStringExtra("Extra_message");
                textView.setText(message);
            }
        }
    }
}
