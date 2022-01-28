public class Multilevel {

	public static void main(String[] args) {
	
		Model t = new Model();
		t.c();
		t.b();
		t.m();
	}
	

}

class Car 
{
	
	void c() {
		System.out.print("This is Car");
	}
}
class Brand extends Car 
{
	
	void b() {
		System.out.print(" of brand BMW");
	}
}

class Model extends Brand
{
	
	void m() {
		System.out.print(" and the model name is i8.");
	}
}
