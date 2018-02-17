package com.example.android.occasioncards;

/**
 * Created by doyou on 2/17/2018.
 */

public class Card {

    private int mStringResourceId1;
    private int mStringResourceId2;
    private int mImageResourceId;

    public Card(int stringResourceId1, int stringResourceId2, int imageResourceId){
        mStringResourceId1 = stringResourceId1;
        mStringResourceId2 = stringResourceId2;
        mImageResourceId = imageResourceId;
    }

    public int getStringResourceId1(){
        return mStringResourceId1;
    }

    public int getStringResourceId2(){
        return mStringResourceId2;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
