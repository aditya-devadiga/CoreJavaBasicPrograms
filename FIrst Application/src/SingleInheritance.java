public class SingleInheritance {

	public static void main(String[] args) {
	
		Scooter1 p = new Scooter1();
		p.v1();
		p.v2();
	}
	

}
class Vehicle1{

	void v1(){
		System.out.print("This is a Vehicle");
	}
}

class Scooter1 extends Vehicle1 {
	
	void v2() {
		System.out.print(" and its a Scooter.");
	}
}

