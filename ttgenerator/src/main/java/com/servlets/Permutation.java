package com.servlets;
import java.util.*;

public class Permutation {
    static ArrayList<String>list=new ArrayList();
    static ArrayList getList()
    {
        return list;        
    }
    
      Permutation() {
       String op=new String("");
       String ip=new String("12345");
       solve(op,ip);        
       getList();
    }
     public static String charRemoveAt(String str, int p) { 
                if(str.length()==0)
                    return "";
              return str.substring(0, p) + str.substring(p + 1);  
           }  
     
    static void solve(String op,String ip)
    {
        if(op.length()==5)
        {
            //System.out.println(op);
           list.add(op);
            return;
        }
        for(int i=0;i<ip.length();i++)
        {
            String temp=ip;           
            //System.out.println(op);
             solve(op+ip.charAt(i),charRemoveAt(temp,i));
        }
        
    }
}
