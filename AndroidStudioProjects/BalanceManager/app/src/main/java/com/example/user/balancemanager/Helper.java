package com.example.user.balancemanager;

/**
 * Created by User on 1/10/2018.
 */

public class Helper {


    public static void actions(double a, String t, String c, History_Linked_List l)//Amount,type,category,list
    {
        Action ac = new Action(a, t ,c);
        l.getAction(ac);
    }
}
