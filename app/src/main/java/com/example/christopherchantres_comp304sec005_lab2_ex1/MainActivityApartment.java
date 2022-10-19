package com.example.christopherchantres_comp304sec005_lab2_ex1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityApartment extends AppCompatActivity {
    CheckBox apt912, apt913, apt914;
    // set up references
    TextView property1, property2, property3;
    TextView price1, price2,price3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_apartment);

        apt912 = findViewById(R.id.chkApartment912);
        apt913 = findViewById(R.id.chkApartment913);
        apt914 = findViewById(R.id.chkApartment914);


        property2 = (TextView) findViewById(R.id.apartment913);
        price2 =  (TextView) findViewById(R.id.apartmentPrice913);
        property3 = (TextView) findViewById(R.id.apartment914);
        price3 =  (TextView) findViewById(R.id.apartmentPrice914);


        String prop2 =property2.getText().toString();
        String prop3 =property3.getText().toString();
        String price02 = price2.getText().toString();
        String price03 = price3.getText().toString();

        Button btn = findViewById(R.id.getBtnApartment);
        btn.setOnClickListener(view -> {
            String result = "Apartment(s) Selected";
            if(apt912.isChecked()){
                result += " 912 ";
                property1 = (TextView) findViewById(R.id.apartment912);
                price1 =  (TextView) findViewById(R.id.apartmentPrice912);
                String prop1 =property1.getText().toString();
                String price01 = price1.getText().toString();

            }
            if(apt913.isChecked()){
                result += " 913 ";
            }
            if(apt914.isChecked()){
                result += " 914 ";
            }


            Intent intent   = new Intent(this, MainActivityCheckOut.class);

            // If you want to send values to second activity..
            intent.putExtra("Property1", prop1);
            intent.putExtra("Property2", prop2);
            intent.putExtra("Property3", prop3);
            intent.putExtra("Price1", price01);
            intent.putExtra("Price2", price02);
            intent.putExtra("Price3", price03);

            startActivity(intent);
            //Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

        });
    }

    @SuppressLint("NonConstantResourceId")
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.apartment912:
                str = checked ? "Apartment912 Selected" : "Apartment912 Deselected";
                break;
            case R.id.apartment913:
                str = checked ? "Apartment913 Selected" : "Apartment913 Deselected";
                break;
            case R.id.apartment914:
                str = checked ? "Apartment914 Selected" : "Apartment914 Deselected";
                break;
        }
        //Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}