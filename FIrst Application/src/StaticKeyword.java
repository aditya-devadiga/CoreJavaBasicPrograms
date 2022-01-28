public class StaticKeyword {
	
	int roll;
	String name;
	static String college ="Mumbai University";
	
	New(int r, String n){
		roll =r;
		name =n;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}
	public static void main(String [] args) {
		StaticKeywor s1=new StaticKeywor(1,"Alisha");
		StaticKeywor s2=new StaticKeywor`(2,"Anisha");
		s1.display();
		s2.display();
	}
}

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
