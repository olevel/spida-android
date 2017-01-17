package com.cyclone.olevel.spida.api.model;

/**
 * Created by O-level
 * On 8/5/15.8:13 AM
 * Email: pcgalilio@yahoo.com
 *
 * @author Osei Prince Charles
 * Mampong - Ashanti
 * (Home Office)
 *
 * Class: This class serves as a model for creating assignment to be broadcast across specific users
 *        that form a class
 */

/**
 * Updated by olevel on 2/24/16.
 */

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;
@Entity
public class Assignment {

    @Id
    private Long mId;
    private String mTopic;
    private String mQuestions;
    private String mSource; // This represents the one who sent the message.
    private Date mDate; // This is specifically the date the assignment was given out
    private Date mDeadLine; // This is the date for last submission of assignment

    public Assignment(){
        mDate = new Date();
    }

    public Date getmDate(){
        return mDate;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Date getmDeadLine() {
        return mDeadLine;
    }

    public void setmDeadLine(Date mDeadLine) {
        this.mDeadLine = mDeadLine;
    }

    public Long getmId() {
        return mId;
    }

    public String getmQuestions() {
        return mQuestions;
    }

    public void setmQuestions(String mQuestions) {
        this.mQuestions = mQuestions;
    }

    public String getmSource() {
        return mSource;
    }

    public void setmSource(String mSource) {
        this.mSource = mSource;
    }

    public String getmTopic() {
        return mTopic;
    }

    public void setmTopic(String mTopic) {
        this.mTopic = mTopic;
    }
}
