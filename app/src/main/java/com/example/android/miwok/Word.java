package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    //    this stores the default translation of the user's language
    private String mDefaultTranslation;
    //    this stores the miwork translation of the default translation of the word
    private String mMiworkTranslation;
    //    stores the id of the image
    private int mImageResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTanslation is the word in a language that the user is already familiar with
     *                          (such as English)
     * @param miworkTranslation is the word in the Miwok language
     */
    public Word(String defaultTanslation, String miworkTranslation) {
        mDefaultTranslation = defaultTanslation;
        mMiworkTranslation = miworkTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTanslation is the word in a language that the user is already familiar with
     *                          (such as English)
     * @param miworkTranslation is the word in the Miwok language
     * @param imageResourceId   is the drawable resource ID for the image associated with the word
     */

    public Word(String defaultTanslation, String miworkTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTanslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
    }

    /*this method gets the default translation of a word
     * @return mDefaultTranslation value*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*this method gets the miwork translation  of the word
     * @return mMiworkTranslation value*/
    public String getMiworkTranslation() {
        return mMiworkTranslation;
    }

    /*gets the image with a particular id
     * @return The image Resource Id*/
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
