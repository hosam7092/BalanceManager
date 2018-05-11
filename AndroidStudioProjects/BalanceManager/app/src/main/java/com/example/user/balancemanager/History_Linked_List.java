package com.example.user.balancemanager;

/**
 * Created by User on 1/10/2018.
 */

import java.util.HashMap;
import java.util.Map;

/* Class linkedList */
public class History_Linked_List {

    private History start;
    private History end ;
    public int size ;

    /*  Constructor  */
    public History_Linked_List()
    {
        start = null;
        end = null;
        size = 0;
    }
    public double theMoneyUHave()
    {
        return this.sumIncomes()+this.sumOutcomes();
    }
    public void getAction(Action a)
    {
        if(start == null)
        {
            this.insertAtStart(a);
        }
        else {
            this.insertAtPos(a);
        }
    }
    public String getInfo()
    {
        String info = "";
        History ptr = start;
        while(ptr != null)
        {
            info = info +"\n"+ ptr.toString();
            ptr=ptr.getLink();
        }
        return info;
    }
    public Map<String,Integer> getPercentage()
    {
        Map<String,Integer> map = new HashMap<String,Integer>();
        int inComes = (int)this.sumIncomes();
        History ptr = this.start;
        while(ptr != null) {
            if(ptr.getAmount() < 0)
            {
                if(map.get(ptr.getCategory()) == null)
                {
                    map.put(ptr.getCategory(), (int)ptr.getAmount());

                }
                else {
                    map.put(ptr.getCategory(), map.get(ptr.getCategory())+(int)ptr.getAmount());

                }
            }
            ptr= ptr.getLink();
        }
        for(Map.Entry<String, Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue()+" from "+ inComes +" Money you have earned");
        }
        if(inComes != 0)
        {
            for(Map.Entry<String, Integer> m:map.entrySet()){

                map.put((String)m.getKey(), (int)m.getValue()*-100/inComes);
                System.out.println(m.getKey()+" "+m.getValue() + "%");
            }
        }

        return map;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return size;
    }
    /*  Function to insert an element at begining  */
    public void insertAtStart(Action val)
    {
        History nptr = new History(val, null);
        size++ ;
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLink(start);
            start = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtEnd(Action val)
    {
        History nptr = new History(val,null);
        size++ ;
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    /*function that searchs in the linked list for position by the date*/
    public int findPosForNAction(Action val)
    {
        if(start != null )
        {
            History nptr = new History(val, null);
            History ptr = start;
            int pos = 2 ;
            if(ptr.getLink() == null)
                return pos;
            for (int i = 1; i < size; i++)
            {
                //SimpleDateFormat t = new SimpleDateFormat ("yyyy");
                if (nptr.getDate().compareTo(ptr.getDate()) < 0)//(Integer.parseInt(t.format(nptr.getDate())) < Integer.parseInt(t.format(ptr.getDate())))
                {
                    return pos;
                }
                while(nptr.getDate().compareTo(ptr.getDate()) > 0)//(Integer.parseInt(t.format(nptr.getDate())) > Integer.parseInt(t.format(ptr.getDate())))
                {
                    if(ptr != end)
                    {
                        ptr.setLink(ptr.getLink());
                        pos++;
                    }
                    else {
                        return pos+1;
                    }

                }

                return pos;
            }
        }
        return 2;
    }
    /*  Function to insert an element at position  */
    public void insertAtPos(Action val)
    {
        History nptr = new History(val, null);
        History ptr = start;
        int pos = findPosForNAction(val);
        pos = pos - 1 ;

        for (int i = 0; i < size; i++)
        {
            if (i == pos || ptr.getLink() == null)
            {
                History tmp = ptr.getLink() ;
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }


        size++ ;
    }
    public void insertAtPos(int pos, Action val)
    {
        History nptr = new History(val, null);
        History ptr = start;
        pos = pos - 1 ;

        for (int i = 0; i < size; i++)
        {
            if (i == pos)
            {
                History tmp = ptr.getLink() ;
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }


        size++ ;
    }
    /*  Function to delete an element at position  */
    public void deleteAtPos(int pos)
    {
        if (pos == 1)
        {
            start = start.getLink();
            size--;
            return ;
        }
        if (pos == size)
        {
            History s = start;
            History t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        History ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++)
        {
            if (i == pos)
            {
                History tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null)
        {
            System.out.println(start.getAmount() );
            return;
        }
        History ptr = start;
        System.out.print(start.getAmount()+ "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getAmount()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getAmount()+ "\n");
    }
    public double sumIncomes()
    {
        double sum = 0.0;
        History ptr = start;
        while(ptr != null)
        {
            if(ptr.getAmount() > 0)
            {
                sum = sum + ptr.getAmount();
            }
            ptr=ptr.getLink();
        }
        return sum;
    }
    public double sumOutcomes()
    {
        double sum = 0;
        History ptr = start;
        while(ptr != null)
        {
            if(ptr.getAmount() < 0)
            {
                sum = sum + ptr.getAmount();
            }
            ptr =ptr.getLink();
        }
        return sum;

    }
}



