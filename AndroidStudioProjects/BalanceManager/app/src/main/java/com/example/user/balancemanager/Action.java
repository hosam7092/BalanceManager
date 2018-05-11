package com.example.user.balancemanager;

/**
 * Created by User on 1/10/2018.
 */

import java.text.SimpleDateFormat;
import java.sql.Date;
/*import java.util.Calendar;*/

public class Action {
    public static double total = 0;
    private String dealsName;
    private double amount;
    private Date date;
    private String category;

    public Action(double amount, String dealsName, String category) {
        this.amount = amount;
        this.dealsName = dealsName;
        this.category = category;
        total = total + amount;
        date = new Date(System.currentTimeMillis());
    }
    public Action(double amount, Date date, String dealsName, String category) {
        this.amount = amount;
        this.date  = date;
        this.dealsName = dealsName;
        total = total + amount;
        this.category = category;

    }

    public String getCategory()
    {
        return this.category;
    }
    public Date GetDate()
    {
        return this.date;
    }
    public double GetAmount()
    {
        return amount;
    }


    public void printDay()
    {
        SimpleDateFormat ft = new SimpleDateFormat ("dd");
        System.out.println(Integer.parseInt(ft.format(date)));
    }

    public void printMonth()
    {
        SimpleDateFormat t = new SimpleDateFormat ("MM");
        System.out.println(t.format(date));
    }

    public String toString() {
        return "Date is " + date + " amount is " + amount + " the name of the product is " +
                dealsName + " Category is " + category;
    }

    public String getDealsName()
    {
        return this.dealsName;
    }

}
