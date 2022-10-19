package com.example.christopherchantres_comp304sec005_lab2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end method

    public void buttonActHomeTypes_OnClick (View view){
        Intent intent   = new Intent(this, MainActivityHomeTypes.class);
        startActivity(intent);
    }
}