public class Single {

	public static void main(String[] args) {
	
		Scooter p = new Scooter();
		p.v1();
		p.v2();
	}
	

}
class Vehicle{

	void v1(){
		System.out.print("This is a Vehicle");
	}
}

class Scooter extends Vehicle {
	
	void v2() {
		System.out.print(" and its a Scooter.");
	}
}

