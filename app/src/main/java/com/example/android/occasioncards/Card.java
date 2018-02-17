package com.example.android.occasioncards;

import android.content.Context;
import android.support.v4.content.ContextCompat;

/**
 * Created by doyou on 2/17/2018.
 */

public class Card {

    private int mStringResourceId1;
    private int mStringResourceId2;
    private int mImageResourceId;
    private int mColorResourceId;

    public Card(int stringResourceId1, int stringResourceId2, int imageResourceId, int colorResourceId){
        mStringResourceId1 = stringResourceId1;
        mStringResourceId2 = stringResourceId2;
        mImageResourceId = imageResourceId;
        mColorResourceId = colorResourceId;
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

    public int getColorResourceId() {
        return mColorResourceId;
    }
}
