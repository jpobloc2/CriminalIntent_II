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
    private String mSuspect;


    public Crime() {
        //Generate unique identifier
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
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

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

}
