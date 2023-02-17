package com.servlets;

import java.util.*;

public class ArrayListToStack {
	
	public ArrayListToStack() {
		
	}

	Stack getStack(int no)
	{
		Stack s=new Stack();
		while(no!=0)
		{
			s.push(no%10);
			no=no/10;
		}
		return s;
	}
}
