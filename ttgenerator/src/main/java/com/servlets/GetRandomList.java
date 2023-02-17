package com.servlets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GetRandomList {

	public GetRandomList() {	}
	
	ArrayList getList()
	{
		Permutation obj=new Permutation();
        ArrayList<String>a=obj.getList();
        ArrayList<String>stringList=new ArrayList();
        
        for(int i=1;i<=6;i++)
        {
            Random r=new Random();         
            int x=r.nextInt(119)+1;
           // System.out.println("x:"+x+" data : "+a.get(x)); 
           stringList.add(a.get(x));
        }
        
        ArrayList al = new ArrayList();
        for(int i=0;i<stringList.size();i++)
        {
            int x = Integer.parseInt(stringList.get(i));
            al.add(x);
        }
        
        return al;
	}
}
