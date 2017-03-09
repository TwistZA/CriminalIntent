package com.bignerdranch.android.criminalintent;

import android.util.Log;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Avinash.Ganga on 08/03/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private final static String TAG = "Crime";

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
        Log.d(TAG,"Crime solved is "+solved);
    }
}
