package com.example.user.balancemanager;

/**
 * Created by User on 1/10/2018.
 */

import java.sql.Date;

public class History {
    private String dealsName;
    private double amount;
    private Date date;
    private String category;
    private History link;

    /*  Constructor  */
    public History()
    {
        link = null;
        amount = 0;
    }
    /*  Constructor  */
    public History(Action a)
    {
        this.link = null;
        this.amount = a.GetAmount();
        this.date = (Date) a.GetDate();
        this.dealsName = a.getDealsName();
        this.category = a.getCategory();
    }

    /*  Constructor  */
    public History(Action a,History n)
    {
        this.dealsName = a.getDealsName();
        this.amount = a.GetAmount();
        this.date = (Date) a.GetDate();
        this.link = n;
        this.category = a.getCategory();
    }
    /*  Function to set link to next Node  */
    public void setLink(History n)
    {
        this.link = n;
    }
    /*  Function to set data to current Node  */
    public void setData(double d)
    {
        this.amount = d;
    }
    /*  Function to get link to next node  */
    public History getLink()
    {
        return this.link;
    }
    /*  Function to get data from current Node  */
    public double getAmount()
    {
        return this.amount;
    }

    public Date getDate()
    {
        return this.date;
    }

    public String getCategory() {
        return this.category;
    }
    public String getDealsName()
    {
        return this.dealsName;
    }
    public String toString() {
        return "Date is " + date + " amount is " + amount + " the name of the product is " +
                dealsName + " Category is " + category;
    }
}