package com.evancc.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()) {
            case R.id.settings:
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(this, "Help Selected", Toast.LENGTH_SHORT).show();
                return  true;
            default:
                return false;
        }
    }
}
