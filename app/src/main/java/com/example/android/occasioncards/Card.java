package com.example.android.occasioncards;

/**
 * Created by doyou on 2/17/2018.
 */

public class Card {

    //create variable for each item in Card object
    private int mStringResourceId1;
    private int mStringResourceId2;
    private int mImageResourceId;
    private int mColorResourceId;

    //constructor to initialize each variable of Card object
    public Card(int stringResourceId1, int stringResourceId2, int imageResourceId, int colorResourceId){
        mStringResourceId1 = stringResourceId1;
        mStringResourceId2 = stringResourceId2;
        mImageResourceId = imageResourceId;
        mColorResourceId = colorResourceId;
    }

    //accessor. allows string resource id to be accessed
    public int getStringResourceId1(){
        return mStringResourceId1;
    }

    //accessor. allows string resource id to be accessed
    public int getStringResourceId2(){
        return mStringResourceId2;
    }

    //accessor. allows image resource id to be accessed
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //accessor. allows color resource id to be accessed
    public int getColorResourceId() {
        return mColorResourceId;
    }
}
