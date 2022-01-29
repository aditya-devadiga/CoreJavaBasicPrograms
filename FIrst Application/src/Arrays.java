public class Arrays{
	public static void main(String[] args)
	{
	int arr[];  //declaring array
	arr = new int[10];		//creating array
	arr[0] = 1;		//initializing an array
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	for(int i =0;i< arr.length;i++)
		System.out.println("Element at index "+ i + ":" + arr[i]);
	
	}
}

//public class New{
//	public static void main(String[] args)
//	{
//		int[] a /*Declaration part (dont specity size)*/  = new int.[5] /*Creation part (specify size here)*/  ;
//		System.out.println(a.getClass().getName());
//	}
//	
//}
	

//public class Arrays{
//public static void main(String[] args)
//	{
//	byte[][] arr = new byte[2][3];
//	System.out.println(arr);
//	System.out.println(arr[0]); // no data value is assign Because array is object it will give default value cause 
//	System.out.println(arr[0][0]);
//	}
//}
