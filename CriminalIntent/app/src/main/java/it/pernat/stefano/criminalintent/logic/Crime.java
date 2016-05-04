package it.pernat.stefano.criminalintent.logic;

import java.util.UUID;

/**
 * Created by stefanopernat on 04/05/16.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        this.mId = UUID.randomUUID();
    }

    public UUID getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
