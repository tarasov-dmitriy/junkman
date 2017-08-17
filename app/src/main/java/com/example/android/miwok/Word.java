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

    /** Constant value that represents no image was provided for this word */
    private static final Integer NO_IMAGE_PROVIDED = -1;
    private Integer mImageResourceId = NO_IMAGE_PROVIDED;

    /** Audio reasource id for the word **/
    private int mAudioResiourceId;

    // Creating a constructor for that class
    public Word(String defaultTranslation, String miwokTranslation, int audioResiourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResiourceId = audioResiourceId;
    }

    // Creating a different constructor for that class
    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceID, int audioResiourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceID;
        mAudioResiourceId = audioResiourceId;
    }

    // Creating all needed methods
    public String getDefaultTranslation(){
        return  mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getmImageResourceID(){ return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getAudioResiourceId() {return mAudioResiourceId; }
}
