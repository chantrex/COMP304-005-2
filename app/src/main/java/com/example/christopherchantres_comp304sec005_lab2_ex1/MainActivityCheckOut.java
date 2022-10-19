package com.example.christopherchantres_comp304sec005_lab2_ex1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityCheckOut extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);

        Bundle values = getIntent().getExtras(); // Need a reference to Intent
        String property1 = values.getString("Property1");
        String housePrice1 = values.getString("Price1");
//        String property2 = values.getString("Property2");
//        String housePrice2 = values.getString("Price2");
//        String property3 = values.getString("Property3");
//        String housePrice3 = values.getString("Price3");

        TextView textViewProperty1 = findViewById(R.id.textViewProperty1);
        textViewProperty1.setText(property1);

        TextView textViewPrice1 = findViewById(R.id.textViewPrice1);
        textViewPrice1.setText(housePrice1);





        Toast.makeText(this, "Property 1:" + String.valueOf(property1) ,Toast.LENGTH_SHORT ).show();
                //+ "\nEmployee Name: " + name + "\nSalary: " + String.valueOf(sal), Toast.LENGTH_SHORT ).show();
        //textViewProperty1.setText(property1);

    } // end method

}
