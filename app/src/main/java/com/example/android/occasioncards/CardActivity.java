package com.example.android.occasioncards;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
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
    private TextView youText;

    private int cardChoice;

    Card[] cards = new Card[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        backgroundImage = findViewById(R.id.background_image);
        greetingText1 = findViewById(R.id.greeting_text1);
        greetingText2 = findViewById(R.id.greeting_text2);
        youText = findViewById(R.id.to_you);

        Intent intent = getIntent();
        cardChoice = intent.getIntExtra("cardChoice", 0);

        generateCards();

        switch (cardChoice){
            case 1: setCard(cards[0]);
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
        cards[0] = new Card(R.string.happy, R.string.birthday, R.drawable.donut, getResources().getColor(R.color.gradientColorEnd));
    }

    private void setCard(Card card){
        backgroundImage.setImageResource(card.getImageResourceId());
        greetingText1.setText(card.getStringResourceId1());
        greetingText1.setTextColor(card.getColorResourceId());
        greetingText2.setText(card.getStringResourceId2());
        greetingText2.setTextColor(card.getColorResourceId());
        youText.setTextColor(card.getColorResourceId());
    }

}
