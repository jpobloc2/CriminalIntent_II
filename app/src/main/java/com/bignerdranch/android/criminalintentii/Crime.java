package com.bignerdranch.android.criminalintentii;

import java.util.Date;
import java.util.UUID;

/**
 * Created by macowner on 2/23/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate = new Date();
    private Boolean mSolved = false;


    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean solved) {
        mSolved = solved;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
