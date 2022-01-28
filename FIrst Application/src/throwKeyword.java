import java.util.Scanner;

public class throwKeyword {

	public static void main(String[] args) {
		
		System.out.println("How Many Years of Experience do you have :");
		Scanner sc = new Scanner(System.in);
		int experience = sc.nextInt();
		
		if(experience<5) {
			throw new eligibility("You're not eligible for this job!!!");
		}
		else {
			System.out.print("Your're Eligible for this Job.");
		}
	}

}

class eligibility extends RuntimeException
{	 
	eligibility(String msg){
		super(msg);
	}
}
