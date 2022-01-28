//Exception handling

//Java Default exception handling
public class DefaultExceptionHandling{
	public static void main(String[] args) {
		m();
	}
	
	static void m()
	{
		m1();
	
	}
	static void m1()
	{
		System.out.println(10/0); //exception because of arithmetic error because of/0
	
	}

}