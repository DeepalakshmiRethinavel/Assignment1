package com.basic.java;

public class Customer {
   private String name;
   private int  empId;
   private long mobileNo;
   private  boolean graduate;
   private  float height;
   private static char bloodGroup;//STATIC VARIABLE
   private final static String nationality="Indian";//FINAL VARIABLE
   
   public void Method1() {
	   String name="Dhanshika";
	   Long mobileNo=3450985002l;
	   System.out.println("Method1 "+"My name :"+ name);
	   System.out.println("my mobile number;"+mobileNo);
   }
	   
   public static void Method2() {   //STATIC METHOD                                           
	   String name="Deepa";
	   int empId=105;
	   System.out.println( "Mymethod2 "+name);
	   System.out.println(empId);
   }
   public  void Method3(String name1,String subject,int std,char sec) {//with arguments
	   
	   System.out.println("Name:"+name1+","+"Subject:"+subject+","+"std;"+std+","+"sec:"+sec+".");
	  
   }
   public int multiply() {//without arguments
	   int X =30;
	   int Y =40;
	   int Z =X*Y;
	   return Z;
   }
	public static void main(String[] args) {;
	   
	Customer deepaObj= new Customer();
	Customer deepaObj1=new Customer();
	deepaObj.Method1();
	Customer.Method2();
	deepaObj.Method3("Abi", "Science", 3,'B');
	int multiply=deepaObj.multiply();
	System.out.println("multiply of X and Y is:"+ multiply);
	}
	}
