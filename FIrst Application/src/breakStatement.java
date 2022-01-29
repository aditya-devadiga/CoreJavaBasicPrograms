 //Break Statement
public class breakStatement{
	public static void main(String[] args)
	{
		  for (int i = 0; i < 10; i++) {
		
			if(i==5) 
				break;      		//Break statements are transfer control statements
						// that are used to terminate any loop							// We cannot use break outside of the loop/switch
			System.out.println(i + " Good Evening");
		}
	}
}