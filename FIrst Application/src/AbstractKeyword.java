public class AbstractKeyword{
	public static void main(String[] args) {

	New1 ob = new New1();
	ob.NoOfWheels();
	ob.m2();
	}
}
abstract class Vehicle
{
	public abstract void NoOfWheels();  //curly braces should not be there just put ; at the end
	public abstract void m2();
}

class New1 extends Vehicle{ 	//If We are not sure about the m2 then we have to make this class abstract too
	public void NoOfWheels() {
		System.out.println("NoOfWheels");
	}
	public void m2() {
		System.out.println("m2");
	}
}
	
