package com.example.user.balancemanager;

import java.sql.Date;
import java.util.Calendar;

public class FinancialLoan1 {
   private double amount;
   private double interest;
   private double perpayment;
   private int manypayments;
   private Date date;

   public FinancialLoan1(double amount, double interest, double perpayment, int manypayments)
   {
       this.amount = amount;
       this.interest = interest;
       this.perpayment = perpayment;
       this.manypayments = manypayments;
       java.util.Date d = Calendar.getInstance().getTime();
   }

    public double getAmount() {
        return amount;
    }

    public double getInterest() {
        return interest;
    }

    public double getPerpayment() {
        return perpayment;
    }

    public int getManypayments() {
        return manypayments;
    }

    public Date getDate() {
        return date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setManypayments(int manypayments) {
        this.manypayments = manypayments;
    }


    public void setPerpayment(double perpayment) {
        this.perpayment = perpayment;
    }
    public double getTotal()
    {
        return this.amount*this.interest;
    }
}
