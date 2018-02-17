package com.example.android.occasioncards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity {

    private ImageView backgroundImage;
    private TextView greetingText1;
    private TextView greetingText2;

    private int cardChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        backgroundImage = findViewById(R.id.background_image);
        greetingText1 = findViewById(R.id.greeting_text1);
        greetingText2 = findViewById(R.id.greeting_text2);

        Intent intent = getIntent();
        cardChoice = intent.getIntExtra("cardChoice", 0);

        switch (cardChoice){
            case 1:;
            case 2:;
            case 3:;
            case 4:;
            case 5:;
            case 6:;
            case 7:;
            case 8:;
            case 9:;
            case 10:;
            case 11:;
        }
    }

    private void generateCards(){
        Card[] cards = new Card[10];
        for(int i = 0; i < cards.length; i++){

        }
    }

    private void setCard(){

    }

}
