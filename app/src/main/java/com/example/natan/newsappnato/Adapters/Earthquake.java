package com.example.natan.newsappnato.Adapters;

/**
 * Created by natan on 8/16/2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private String mTitle;

    /** Location of the earthquake */
    private String mDes;

    /** Time of the earthquake */
    private String mImage;





    public Earthquake(String title, String des, String image ) {
        mTitle = title;
        mDes = des;
        mImage = image;



    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getDes() {
        return mDes;
    }

    /**
     * Returns the time of the earthquake.
     */
    public String getImage() {
        return mImage;
    }




    /**
     * Returns the website URL to find more information about the earthquake.
     */

}