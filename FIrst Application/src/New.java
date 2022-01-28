// While loop
//public class New {
//	public static void main(String[] args) {
//		int i= 11;
//		while(i < 11) {
//			System.out.println(i);
//			i++;
//		}
//	}
//}

//public class New {
//	public static void main(String[] args) {
//		int i= 11;
//		 do{
//			System.out.println(i);
//			i++;
//		}while(i < 11);
//	}
//}

// Switch Case
//public class New {
//	public static void main(String[] args) {
//		int num = 2;
//		
//		switch(num) {
//		case 1 : 
//				System.out.println("The Number is 1");
//				break;
//		case 2 : 
//			System.out.println("The Number is 2");
//			break;
//		case 3 : 
//			System.out.println("The Number is 3");
//			break;
//		case 4 : 
//			System.out.println("The Number is 4");
//			break;
//		default :
//			System.out.print("Invalid Number");
//		}
//	}
//}
//


//	Retrieving Data from 2D array with for loop
//public class New {
//	public static void main(String[] args) {
//		{int[] []x= {{10,20,30,40},{50,60}};
//		for (int i=0;i<x.length;i++) {
//			for (int j=0;j<x[i].length;j++)
//			{
//				System.out.println(x[i][j]);
//			}
//		}
//		}
//	}
//
//}

// Break Statement
//public class New{
//	public static void main(String[] args)
//	{
//		int i=10;
//		{
//			if(i==10)
//				break;   // We cannot use break outside of the loop/switch
//			System.out.println("Good Evening");
//		}
//	}
//}

// Continue Statement
//public class New{
//	public static void main(String[] args)
//	{
//		int x=0;
//		do {
//			x++;
//			System.out.println(x);
//				if(++x<5)
//					continue; // if condition is true it will go to while 
//				x++;
//				System.out.println(x);
//		} while(++x<10);
//}
//}

///////////////////////// ARRAYS///////////////////////

//public class New{
//	public static void main(String[] args)
//	{
//	int arr[];  //declaring array
//	arr= new int[10];		//creating array
//	arr[] = {2,3,4,5};		//initializing an array
//	}
//}

//public class New{
//	public static void main(String[] args)
//	{
//		int[] a /*Declaration part (dont specity size)*/  = new int.[5] /*Creation part (specify size here)*/  ;
//		System.out.println(a.getClass().getName());
//	}
//	
//}
	

//public class New{
//public static void main(String[] args)
//	{
//	byte[][] arr = new byte[2][3];
//	System.out.println(arr);
//	System.out.println(arr[0]); // no data value is assign Because array is object it will give default value cause of 
//	System.out.println(arr[0][0]);
//	}
//}


//////////////////////////////////////String////////////////////////////
//public class New{
//public static void main(String[] args)
//	{
//	String s = new String("Aditya");
//	System.out.println(s);
//	}
//}

//public class New{
//public static void main(String[] args)
//	{
//	String s = new String("Aditya");
//	s.concat("Devadiga");			//String objecs are immutable(cannot change the sting)
//	System.out.println(s);
//	}
//}

//public class New{
//public static void main(String[] args)
//	{
//	StringBuffer s = new StringBuffer("Aditya");
//	s.append("Devadiga");			//String objecs are mutable(can change the sting)
//	System.out.println(s);
//	}
//}

// STRING METHODS
//public class New{
//public static void main(String[] args)
//	{
//	String s = new String("Aditya");
//	String s1 = s.concat(" Devadiga");			//String objects are immutable(cannot change the sting)
//	System.out.println(s1.length()); // length method
//	System.out.println(s1.toLowerCase()); //lower case method
//	
//	String s2="MUMBAI";
//	String s3 ="   Space   ";
//	System.out.println(s2.equals("mumbai"));// java is case sensitive so the output will be false
//	
//	System.out.println(s2.equalsIgnoreCase("mumbai")); // ignore case sensitive so the output is true
//	System.out.println(s2.replace('M','T')); // replace the char in string
//	System.out.println(s2.substring(2,6)); // beginning index is included while the ending index is excluded
//   /////////////////////////////////////
//	
//	System.out.println(s3.trim());
//	System.out.println(s1.substring(3)); //Return the substring starting from the given index to end of the string
//	System.out.println(s1.startsWith("Adi")); //	
//	System.out.println(s1.endsWith("Adi"));
//	System.out.println(s1.charAt(7)); //Return the value of character at the given index number
//	System.out.println(s1.indexOf("D")); //Return the Index number of given substring
//	}
//}

// Concatenating String

//public class New
//{
//		public static void main(String[] args)
//		{
//				String a="Avantika ";
//				int b=10,c=20,d=30;
//				
//				s=s.concat("Tiwari ");
//				
//				s=s+ "Bisht "; //This is the new instance and s is directed to new instance
//				
//				s+= "The Great";
//				
//				System.out.println(s);
//		}
//}

// Operator overloading is not alloweed in java except "+"

//public class New
//{
//		public static void main(String[] args)
//		{
//				String a="Avantika ";
//				int b=10,c=20,d=30;
//				System.out.println(a+b+c+d);
//
//				System.out.println(b+c+d+a);
//				
//				System.out.println(b+c+a+d); //once it start concatenation it will keep on concatenating
//				
//				System.out.println(b+a+c+d);
//		}
//}

//public class New
//{
//	public static void main(String[] args)
//	{
//			String s1= new String("Avantika");
//			String s2= new String("Avantika");
//			
//			StringBuffer s3= new StringBuffer("Avantika");
//			StringBuffer s4= new StringBuffer("Avantika");
//			
//			System.out.println(s1==s2);			// Reference Comparison
//			System.out.println(s1.ez`quals(s2));	// Content Comparison
//			System.out.println(s3==s4);			// Reference Comparison
//			System.out.println(s3.equals(s4));	// Reference  Comparison (couldnt override)
//	}
//}


//import java.util.*;
//public class New
//{
//	public static void main(String[] args)
//	{
//		List<String> example = new ArrayList <String>0;
//		example.add("12");
//		example.add("44");
//		example.add("12");
//		example.add("55");
//		System.out.print(example);
//	}
//}


/////Abstract

//public class New{
//	public static void main(String[] args) {
//
//		
//	}
//}
//abstract class Vehicle
//{
//	public abstract void NoOfWheels();  //curly braces should not be there just put ; at the end
//	public abstract void m2();
//}
//
//abstract class New1 extends Vehicle{ 	//We are not sure about the m2 therefore we have to make this class abstract
//	public void NoOfWheels() {
//		System.out.println("2");
//	}
//}
	
//public class New{
//	public static void main(String[] args) {
//		final int a = 10 ;
//		System.out.println(a);
//		int b =a+1;
//		System.out.println(b);
//	}
//}



// Final Access Modifier used in variable and class/object
//public class New{
//public static void main(String[] args) {
//}
//}
//class P 
//{
//	void property()
//	{
//	System.out.println("");
//	}
// void marry()
//	{
//		System.out.println("Laxmi");
//	}
//}
//	
//class C extends P
//{
//	void marry()    //method overriding
//	{
//		System.out.println("Katrina");
//	}
//}

// Abstraction  (Abstract Class and Abstract Method)



//abstract class New			// Abstract class can contain abstract as well as normal or any other method also which means(0 to 100% Abstraction)
//{
//	abstract void start();  //A method without a body is known as abstract method
//							// A method must always be declared in abstract class only	
//							// or we can say that if a class has a an abstract method the class should be declared as abstract as well
//}
//
//class Car extends New{
//	
//	 void start(){
//		System.out.println("Car starts with key");
//	}
//}
//
//class Scooter extends New{
//	
//	 void start(){
//		System.out.println("Scooter starts with key");
//	}
//	 }
//


//public class New {
//	
//	int roll;
//	String name;
//	static String college ="Mumbai University";
//	
//	New(int r, String n){
//		roll =r;
//		name =n;
//	}
//	void display()
//	{
//		System.out.println(roll+" "+name+" "+college);
//	}
//	public static void main(String [] args) {
//		New s1=new New(1,"Alisha");
//		New s2=new New(2,"Anisha");
//		s1.display();
//		s2.display();
//	}
//}

//public class New{
//	static int a;		//Only class level variable can be static
//	public static void main(String[] args) {
//		System.out.print("Executing the main block");
//			System.out.println(a);
//			
//	}
//	static void m()
//	{
//		System.out.println("I am static Method()");
//		
//	}
//	
//	static
//	{
//		System.out.println("India is best");
//		m();
//	}
//	static
//	{
//		System.out.println("Vande Mataram");
//		
//	}
//}

// Polymorphism

//Method Overloading same method name different parameters list
//public class New{
//	public void m() {
//		System.out.println("No parameters");
//	}
//	public void m(int a) {
//		System.out.println("I'm integer method");
//	}
//	public void m(double b) {
//		System.out.println("I'm double method");
//	}
//	public static void main(String[] args) {
//		
//		New obj = new New();
//		obj.m();
//		obj.m(6);
//		obj.m(6.11);
//		// Automatic promotion
//		obj.m('a');
//		obj.m(4l);
//		obj.m(3.87f);
//		obj.m(3);
//	}
//}

//public class New{
//	public void m(Object o) {
//		System.out.println("Object Class");
//	}
//	public void m(String s) {
//		System.out.println("String Class");
//	}
//	
//	public static void main(String[] args) {
//		
//		New obj = new New();
//		obj.m(new Object());
//		obj.m("Aditya");
//		obj.m(null);
//	}
//}

//Exception handling

//Java Default exception handling
//public class New{
//	public static void main(String[] args) {
//		m();
//	}
//	
//	static void m()
//	{
//		m1();
//	
//	}
//	static void m1()
//	{
//		System.out.println(10/0); //exception because of arithmetic error because of/0
//	
//	}
//
//}

// Java Exception with keyword "try"
//public class New{
//	public static void main(String[] args) {
//		System.out.println("hiiiiiii");
//	
//	
//	try
//	{
//		System.out.println(10/0);
//	
//	}
//	catch(ArithmeticException e) //Exception handling for Arithmetic Exception 
//	{
//		System.out.println(10/2); //
//	}
//	System.out.println("Hello");
//}
//}

//public class New{
//	public static void main(String[] args) {
//	int[] arr = new int[4];
//	try {
//		System.out.println(arr[4]);
//		System.out.println("Inside");
//	}
//	catch(Exception e)
//	{
//		System.out.println(e);
//	}
//	}
//}
//////////////////////try catch 
//public class New{
//	public static void main(String[] args) {
//	
//	try {
//		System.out.println(1);
//		System.out.println(2/0);
//		System.out.println(3);
//	}
//	catch(NullPointerException e)
//	{
//		System.out.println(4/0);
//	}
//	
//	finally {
//		System.out.println(5/0);
//	}
//	System.out.println(6);
//	}
//}

//import java.util.Scanner;
//public class New{
//	public static void main(String[] args) 
//	{
//		int age;
//		System.out.println("Enter your age:");
//		Scanner sc = new Scanner(System.in);
//		age = sc.nextInt();
//	
//		if(age<18)
//		{
//			throw new CantVote("You cannot cast your vote......");
//	}
//		else {
//			System.out.println("You can vote happily...");
//		}
//}
//}
//
//class CantVote extends RuntimeException
//{
//	CantVote (String msg)
//	{
//		super(msg);
//	}
//}

//public class New{
//	public static void main(String[] args) 
//	{
//		m1();
//	}
//	public static void m1()
//	{
//		m2();
//		
//	}
//	public static void m2()
//	{
//		System.out.print(5/0);
//	}
//}
//	
//	

//class Hellothread implements Runnable{
//	public void run() {
//		for(int i =0;i<10;i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}
//
//public class New{
//	
//	public static void main(String[] args) {
//		Hellothread n = new Hellothread();
//		Thread t = new Thread(n);
//		t.start();
//		
//		for(int i =0;i<10;i++) {
//			System.out.println("Main Thread");
//		}
//	}
//}
////       Join() Method      
//	public class New extends Thread{
//	
//	public void run() {
//		try {
//			for (int i=1;i<=5;i++) {
//				System.out.println("Child Thread"+i);
				
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		New j = new New();
//		j.start();
//		
//		
//		try {
//			for (int i=1;i<=5;i++) {
//				System.out.println("Main Thread"+i);
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//}

//import java.util.ArrayList;
//
//public class New
//{
//	public static void main(String[] args) {
//		
////		Float i = new Float("ss);
//		Boolean b = new Boolean("True");
//		Boolean c = new Boolean("True");
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(b.equals(c));
//	}
//}

//public class New
//{
//	public static void main(String[] args) {
//		
//		Test obj= new Test();  ;
//		obj.myMethod(null);
//		
//	}
//}
//
//class Test{
//	public void myMethod(Object s) {
//		System.out.println("String");	
//	}
//	public void myMethod(String  o) {
//		System.out.println("Object");
//	}
//	
//}

class Test{
	int i;
}

class New{
	public static void main(String[] args) {
		Test t;
		System.out.println(t.i);
	}	
}
