package com.cyclone.olevel.spida.api.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by olevel on 3/26/16.
 * (UMaT, Tarkwa)
 * Purpose:
 */
@Entity
public class Group {
    /* Data Members */
    @Id
    Long mId;
    String mName;
    String mSection; // Notice, Assignment or Library

    public Group () {

    }

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

    public String getmSection() {
        return mSection;
    }

    public void setmSection(String mSection) {
        this.mSection = mSection;
    }
}
