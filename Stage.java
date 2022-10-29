package com.example.project;

import java.util.Date;

public class Stage {

    private int docNumber;
    private int newValue;
    private int oldValue;
    private Date date;
    private boolean status;

    public Stage(int docNumber, int newValue, int oldValue, Date date) {
        this.docNumber = docNumber;
        this.newValue = newValue;
        this.oldValue = oldValue;
        this.date = date;
    }

    //To find if it green or red flag
    public boolean getStatus (){
        status = (newValue - oldValue) >= 0;
        return status;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public int getNewValue() {
        return newValue;
    }

    public Date getDate() {
        return date;
    }
}


