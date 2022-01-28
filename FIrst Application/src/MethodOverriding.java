

public class MethodOverriding{
public static void main(String[] args) {
	
	C obj = new C();
	obj.marry();
}
}
class P 
{
	void property()
	{
	System.out.println("");
	}
 void marry()
	{
		System.out.println("Laxmi");
	}
}
	
class C extends P
{
	void marry()    //method overriding
	{
		System.out.println("Katrina");
	}
}
