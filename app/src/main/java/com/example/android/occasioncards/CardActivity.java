package com.example.android.occasioncards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity {

    //creates variable for each view that will change
    private ImageView backgroundImage;
    private TextView greetingText1;
    private TextView greetingText2;
    private TextView youText;

    //variable to store user's card choice
    private int cardChoice;

    //declare array of Card objects
    Card[] cards = new Card[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        //initialize variable for each view that will change
        backgroundImage = findViewById(R.id.background_image);
        greetingText1 = findViewById(R.id.greeting_text1);
        greetingText2 = findViewById(R.id.greeting_text2);
        youText = findViewById(R.id.to_you);

        //get intent from MainActivity
        Intent intent = getIntent();
        //store users card choice in variable
        cardChoice = intent.getIntExtra("cardChoice", 0);

        //calls method that creates the objects in card array
        generateCards();

        //switch statement to call set card for correct card from user choice
        switch (cardChoice){
            case 1:
                setCard(cards[0]);
                break;
            case 2:
                setCard(cards[1]);
                break;
            case 3:
                setCard(cards[2]);
                break;
            case 4:
                setCard(cards[3]);
                break;
            case 5:
                setCard(cards[4]);
                break;
            case 6:
                setCard(cards[5]);
                break;
            case 7:
                setCard(cards[6]);
                break;
            case 8:
                setCard(cards[7]);
                break;
            case 9:
                setCard(cards[8]);
                break;
            case 10:
                setCard(cards[9]);
                break;
            case 11:
                setCard(cards[10]);
                break;
            case 12:
                setCard(cards[11]);
                break;
        }
    }

    //method to reset spinner to "choose card"
    @Override
    public void onBackPressed() {
        Intent cardIntent = new Intent(CardActivity.this, MainActivity.class);
        cardIntent.putExtra("cardChoice", 0);
        startActivity(cardIntent);
   }

   //mathod to create each Card object in card array
   private void generateCards(){
       cards[0] = new Card(R.string.happy, R.string.birthday, R.drawable.donut, getResources().getColor(R.color.gradientColorEnd));
       cards[1] = new Card(R.string.happy, R.string.year, R.drawable.newyear, getResources().getColor(R.color.white));
       cards[2] = new Card(R.string.happy, R.string.groundhog, R.drawable.groundhog, getResources().getColor(R.color.black));
       cards[3] = new Card(R.string.happy, R.string.valentine, R.drawable.valentine, getResources().getColor(R.color.red));
       cards[4] = new Card(R.string.happy, R.string.patrick, R.drawable.patrick, getResources().getColor(R.color.black));
       cards[5] = new Card(R.string.happy, R.string.easter, R.drawable.easter, getResources().getColor(R.color.gradientColorEnd));
       cards[6] = new Card(R.string.happy, R.string.mother, R.drawable.mother, getResources().getColor(R.color.white));
       cards[7] = new Card(R.string.happy, R.string.father, R.drawable.fathers, getResources().getColor(R.color.colorPrimary));
        cards[8] = new Card(R.string.happy, R.string.independence, R.drawable.independence, getResources().getColor(R.color.black));
       cards[9] = new Card(R.string.happy, R.string.halloween, R.drawable.halloween, getResources().getColor(R.color.orange));
       cards[10] = new Card(R.string.happy, R.string.thanks, R.drawable.thanks, getResources().getColor(R.color.orange));
       cards[11] = new Card(R.string.merry, R.string.christmas, R.drawable.christmas, getResources().getColor(R.color.white));
   }

   //method to set correct values to each view in card
    private void setCard(Card card){
        backgroundImage.setImageResource(card.getImageResourceId());
        greetingText1.setText(card.getStringResourceId1());
        greetingText1.setTextColor(card.getColorResourceId());
        greetingText2.setText(card.getStringResourceId2());
        greetingText2.setTextColor(card.getColorResourceId());
        youText.setTextColor(card.getColorResourceId());
    }

}
