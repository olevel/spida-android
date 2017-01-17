package com.cyclone.olevel.spida.api.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by olevel on 3/26/16.
 * (UMaT, Tarkwa)
 * Purpose:
 */
@Entity
public class Role {
    /* Data Members */
    @Id
    Long mId;
    String mName;
    String mUser;
    String mGroup;

    /* Constructor */
    public Role () {

    }

    /* Getter and Setter Methodsd */

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

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmGroup() {
        return mGroup;
    }

    public void setmGroup(String mGroup) {
        this.mGroup = mGroup;
    }
}
