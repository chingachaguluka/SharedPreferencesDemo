package com.evancc.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textEdit);


        SharedPreferences sharedPreferences = this.getSharedPreferences("com.evancc.sharedpreferencesdemo", Context.MODE_PRIVATE);
        //sharedPreferences.edit().putString("name", "Chinga").apply();

        String name = sharedPreferences.getString("name", "Non Supplied");
        textView.setText(name);
    }
}
