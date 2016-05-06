package it.pernat.stefano.criminalintent.logic;

import java.util.Date;
import java.util.UUID;

/**
 * Created by stefanopernat on 04/05/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
    }

    public UUID getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Date getDate() {
        return this.mDate;
    }

    public boolean isSolved() {
        return this.mSolved;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }
}
