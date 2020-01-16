package com.example.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText=findViewById(R.id.editMessage);
    }
    public void goHome(View view)
    {
        String message=editText.getText().toString();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("Extra_message",message);
        setResult(RESULT_OK,returnIntent);
        finish();
    }

}
