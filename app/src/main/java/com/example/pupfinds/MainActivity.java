package com.example.pupfinds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
Button NextBtn;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NextBtn = findViewById(R.id.Next0);

    }

    public void NextClck(View v){
        Intent i = new Intent(this,MenuActivity.class);
        startActivity(i);
    }


}
