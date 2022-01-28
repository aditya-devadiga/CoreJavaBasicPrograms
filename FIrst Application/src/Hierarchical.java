public class Hierarchical {

	public static void main(String[] args) {
	
		Bike v = new  Bike();
		Bus b = new Bus();
		v.vehicle();
		
		b.bus();
		v.bike();
		
	}
	

}
class Vehicles
{

	void vehicle(){
		System.out.println("There are different types of Vehicles:");
	}
}

class Bus extends Vehicles
{
	
	void bus() {
		System.out.println(" a Bus");
	}
}

class Bike extends Vehicles
{
	
	void bike() {
		System.out.println(" a Bike");
	}
}
