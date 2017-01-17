package com.cyclone.olevel.spida.api.model;

import java.util.UUID;

/**
 * Created by olevel on 2/24/16.
 */
public class Library {
    /* Library Properties */
    private UUID mId;
    private String mFormat;
    private String mTitle;
    private String mAuthor;


    /* Constructor */
    public Library() {
        mId = UUID.randomUUID();
    }

    /**
     * Getter and Setter Methods
     */
    public UUID getmId() {
        return mId;
    }

    public String getmFormat() {
        return mFormat;
    }

    public void setmFormat(String mFormat) {
        this.mFormat = mFormat;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }
}
