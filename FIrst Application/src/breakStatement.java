 Break Statement
public class New{
	public static void main(String[] args)
	{
		int i=10;
		{
			if(i==10)
				break;      		//Break statements are transfer control statements
									// that are used to terminate any loop
									// We cannot use break outside of the loop/switch
			System.out.println("Good Evening");
		}
	}
}