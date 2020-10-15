package com.nt.test;

import java.util.Date;

public class Test {
public void foo() {
	System.out.println("foo aaa");
}

public void moo() {
	System.out.println("dd");
}
	public static void main(String[] args) {
		Test t=new Test();
		
		
		String str = "asdf";
		String str1 = "asdf";
		
		System.out.println(str.equals(str1) ? (str.length()==4 ?"4":null) : false);
		
		if(str.equals(str1)) {
			System.out.println("home");
			if(str.length()==4)
				System.out.println("4");
		}else
			System.out.println("Nothing");
		
		//System.out.println(new Date());
		//String shiftTiming = null;
//		if (06:00 to 13:59)
//			shiftTiming="morning";
//		else if (14:00 to 21:59)
//			shiftTiming="aft";
//		else if (22:00 to 05:59)
//			shiftTiming="night";
		 Date dt = new Date();
		 String shiftTiming=null;
	        int hours = dt.getHours();
	        int min = dt.getMinutes();
	        System.out.println(dt.getHours());
	        System.out.println(dt.getMinutes());

	        if(hours>=6 && hours<=14){
	        	System.out.println(shiftTiming="Morning");
	        }
	            
	        else if(hours>=14 && hours<=22){
	        	System.out.println(shiftTiming="Afternoon");
	        
	        
	        }else if(hours>=22 && hours<=6){
	        	System.out.println(shiftTiming="Night");
	        }
		
		/*
		 * t.foo();
		 * 
		 * String str;
		 * 
		 * Test1 t1=new Test1(); ArrayList<Object> arrayList = new ArrayList<Object>();
		 * arrayList.add(t); arrayList.add(t1);
		 */
		
	}
	
	public void add() {
		class B{
			
		}
	}
	
	/*
	 * public void addon() { public void sub() { class B{
	 * 
	 * } }
	 * 
	 * Java =====
	 */

}
