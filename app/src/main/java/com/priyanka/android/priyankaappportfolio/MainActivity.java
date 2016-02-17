package com.priyanka.android.priyankaappportfolio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastIt(View view){
        Context context = getApplicationContext();
        Button button = (Button) view;
        String text = button.getText().toString();
        text = "This button will launch my "+ (text.contains("App")? text:( text+" app!"));
        Log.e("Priyanka", text);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        //added useless comments
    }

}
