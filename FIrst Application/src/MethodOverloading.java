// Polymorphism

//Method Overloading same method name different parameters list
public class MethodOverloading{
	public void m() {
		System.out.println("No parameters");
	}
	public void m(int a) {
		System.out.println("I'm integer method");
	}
	public void m(double b) {
		System.out.println("I'm double method");
	}
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.m();
		obj.m(6);
		obj.m(6.11);
		// Automatic promotion
		obj.m('a');
		obj.m(4l);
		obj.m(3.87f);
		obj.m(3);
	}
}

//public class New{
//	public void m(Object o) {
//		System.out.println("Object Class");
//	}
//	public void m(String s) {
//		System.out.println("String Class");
//	}
//	
//	public static void main(String[] args) {
//		
//		New obj = new New();
//		obj.m(new Object());
//		obj.m("Aditya");
//		obj.m(null);
//	}
//}
