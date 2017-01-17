package com.cyclone.olevel.spida.api.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by olevel on 3/26/16.
 * (UMaT, Tarkwa)
 * Purpose:
 */
@Entity
public class User {
    /* Data Members */
    @Id
    Long mId;
    String mName;
    String mPhoneNumber;
    String mEmail;

    /* Constructor */
    public User () {

    }

    /*Getter and Setter Methods*/

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}
