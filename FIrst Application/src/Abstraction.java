// Abstraction  (Abstract Class and Abstract Method)



abstract class Abstraction1			// Abstract class can contain abstract as well as normal or any other method also which means(0 to 100% Abstraction)
{
	abstract void start();  //A method without a body is known as abstract method
							// A method must always be declared in abstract class only	
							// or we can say that if a class has a an abstract method the class should be declared as abstract as well
}

class Car extends Abstraction{
	
	 void start(){
		System.out.println("Car starts with key");
		
		 }
}

class Scooter extends Abstraction{
	
	 void start(){
		System.out.println("Scooter starts with key");
	}
	 
	 }
class Abstraction{
	public static void main(String[] args) {
		 Scooter s = new Scooter();
		 Car c = new Car();
		 s.start();
		 c.start();
	}
}