package com.example.christopherchantres_comp304sec005_lab2_ex1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityHomeTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_types);

        TextView textView = findViewById(R.id.textView);
        //this view is associated with context menu
        //if you do a long click here, the context menu
        //will be displayed.
        registerForContextMenu(textView);
    }
    //
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }
    //
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.apartment:
                Toast.makeText(this, "You selected apartment!", Toast.LENGTH_LONG).show();
                Intent intent   = new Intent(this, MainActivityApartment.class);
                startActivity(intent);
                break;

            case R.id.detached_home:
                Toast.makeText(this, "You selected detached home!", Toast.LENGTH_LONG).show();
                break;

            case R.id.semi_detached_home:
                Toast.makeText(this, "You selected Semi Detached Home!", Toast.LENGTH_LONG).show();
                break;

            case R.id.condominium:
                Toast.makeText(this, "You selected Condominium!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.town_house:
                Toast.makeText(this, "You selected Town House!", Toast.LENGTH_LONG).show();
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;

    }
    //
/*    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }
    //
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.edit:
                Toast.makeText(this, "You selected Edit!", Toast.LENGTH_LONG).show();
                return true;
            case R.id.delete:
                Toast.makeText(this, "You selected Delete!", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }*/
}
