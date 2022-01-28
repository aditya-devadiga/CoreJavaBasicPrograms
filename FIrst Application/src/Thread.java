//class Hellothread implements Runnable{
//	public void run() {
//		for(int i =0;i<10;i++) {
//			System.out.println("Child Thread");
//		}
//	}
//}
//
//public class New{
//	
//	public static void main(String[] args) {
//		Hellothread n = new Hellothread();
//		Thread t = new Thread(n);
//		t.start();
//		
//		for(int i =0;i<10;i++) {
//			System.out.println("Main Thread");
//		}
//	}
//}

////       Join() Method      
//	public class New extends Thread{
//	
//	public void run() {
//		try {
//			for (int i=1;i<=5;i++) {
//				System.out.println("Child Thread"+i);
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		New j = new New();
//		j.start();
//		
//		
//		try {
//			for (int i=1;i<=5;i++) {
//				System.out.println("Main Thread"+i);
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//}
