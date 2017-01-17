package com.cyclone.olevel.spida.api.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;


/**
 * Created by olevel on 2/24/16.
 */
@Entity
public class Notice {
    //Notice properties
    @Id
    private Long mId;
    private String mCaption;
    private String mBody;
    private String mSource;
    private Date mDate;

    /* Contructor */
    public Notice () {
        mDate = new Date();
    }

    /* Getter and Setter Methods */

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody;
    }

    public String getmCaption() {
        return mCaption;
    }

    public void setmCaption(String mCaption) {

        this.mCaption = mCaption;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Long getmId() {
        return mId;
    }

    public String getmSource() {
        return mSource;
    }

    public void setmSource(String mSource) {
        this.mSource = mSource;
    }
}
