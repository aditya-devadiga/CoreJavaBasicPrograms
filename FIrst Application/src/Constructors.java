public class Constructors 
 {	
	int emp_id;
	String name;
	
	Constructors(int emp_id , String name)			//  Parameterized Constructors
	{
		this.emp_id = emp_id;
		this.name= name;
	}
	
	public static void main(String[] args) 
	{
		Constructors Employee1 = new Constructors(1,"Aditya Devadiga");
		Constructors Employee2 = new Constructors(2,"Rohan Sharma");
		
		System.out.println("Employee no : " + Employee1.emp_id + " " + Employee1 .name);
		System.out.println("Employee no : " + Employee2.emp_id + " " + Employee2.name);
	}

	
}
