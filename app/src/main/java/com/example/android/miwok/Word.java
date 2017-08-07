package com.example.android.miwok;

/**
 * This class has 2 String variables containing miwok and english translations
 * constructor is need in order to be able to create new instance of the class
 * Created by admin on 7/31/17.
 */

public class Word {
    //declaring members of the class (lowcase m letter) - these are state of the class
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private Integer mImageResourceID;

    // Creating a constructor for that class
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Creating all needed methods
    public String getDefaultTranslation(){
        return  mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getmImageResourceID(){ return mImageResourceID; }
}
