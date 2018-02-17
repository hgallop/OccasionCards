package com.example.android.occasioncards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variable for spinner
    Spinner cardSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize spinner
         cardSpinner = findViewById(R.id.card_spinner);
        // Creates an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cards_array, android.R.layout.simple_spinner_item);
        // Specifies the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Applies the adapter to the spinner
        cardSpinner.setAdapter(adapter);

        //sets listener to user choice from spinner
        cardSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapter, View view, int pos, long l) {
                //gets position
                adapter.getItemAtPosition(pos);
                //recognizes user choice is other than "choose card"
                if (pos > 0){
                    //creates intent to open card activity
                    Intent cardIntent = new Intent(MainActivity.this, CardActivity.class);
                    //sends user choice to card activity
                    cardIntent.putExtra("cardChoice", pos);
                    //creates intent to open card activity
                    startActivity(cardIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
