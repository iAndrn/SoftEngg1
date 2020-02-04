package com.example.pupfinds;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pupfinds.ui.pages.CompShopActivity;
import com.example.pupfinds.ui.pages.FoodPageActivity;
import com.example.pupfinds.ui.pages.LandmarksActivity;
import com.example.pupfinds.ui.pages.SchoolSuppliesActivity;
import com.example.pupfinds.ui.pages.TranspoActivity;

public class MenuActivity extends Activity {
    Button FoodBtn;
    Button ComputerBtn;
    Button SuppliesBtn;
    Button TranspoBtn;
    Button LandmarkBtn;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        FoodBtn = findViewById(R.id.menuitem1);
        ComputerBtn = findViewById(R.id.menuitem2);
        SuppliesBtn = findViewById(R.id.menuitem3);
        TranspoBtn = findViewById(R.id.menuitem4);
        LandmarkBtn = findViewById(R.id.menuitem5);


    }



    public void fooditemClck(View v){
        Intent i = new Intent(this, FoodPageActivity.class);
        startActivity(i);
    }

    public void computeritemClck(View v){
        Intent i = new Intent(this, CompShopActivity.class);
        startActivity(i);
    }

    public void suppliesitemClck(View v){
        Intent i = new Intent(this, SchoolSuppliesActivity.class);
        startActivity(i);
    }

    public void transpoitemClck(View v){
        Intent i = new Intent(this, TranspoActivity.class);
        startActivity(i);
    }

    public void landmarkitemClck(View v){
        Intent i = new Intent(this, LandmarksActivity.class);
        startActivity(i);
    }
}
