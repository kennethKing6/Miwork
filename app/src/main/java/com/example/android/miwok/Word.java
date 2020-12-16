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
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    //    stores the resource id for the songs at a particular position
    private int mAudioResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTanslation is the word in a language that the user is already familiar with
     *                          (such as English)
     * @param miworkTranslation is the word in the Miwok language
     * @param song    is the raw resource ID for the image associated with the word
     */
    public Word(String defaultTanslation, String miworkTranslation, int song) {
        mDefaultTranslation = defaultTanslation;
        mMiworkTranslation = miworkTranslation;
        mAudioResourceId = song;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTanslation is the word in a language that the user is already familiar with
     *                          (such as English)
     * @param miworkTranslation is the word in the Miwok language
     * @param imageResourceId   is the drawable resource ID for the image associated with the word
     * @param song              is the raw resource ID for the image associated with the word
     */

    public Word(String defaultTanslation, String miworkTranslation, int imageResourceId, int song) {
        mDefaultTranslation = defaultTanslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = song;
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

    /*
     * @return The image Resource Id of the word*/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiworkTranslation='" + mMiworkTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
