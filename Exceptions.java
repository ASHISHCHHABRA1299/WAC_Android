package wacWorkshop1;

import java.util.Arrays;

//class Person1 {
//	String name;
//	int age;
//
//	Person1(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "Name: " + this.name + " Age: " + this.age;
//	}
//}

public class Exceptions {

	public static void main(String[] args) {
//		try {
//
//			// code that generate exception
//			int divideByZero = 5 / 0;
//			System.out.println("Rest of code in try block");
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Byee");
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("ArithmeticException => " + e.getMessage());
//		}
//
//		finally {
//			System.out.println("Byee");
//		}

//		Person1 p = new Person1("Ashish", 1);
//		System.out.println(p);
//		Person1 p2=new Person1("Niloy", 2);
//		System.out.println(p2);

		String s = new String("Niloy is a good boy");
		String[] arr = s.split(" ");
//		System.out.println(Arrays.toString(arr));
		int i=0;int j=arr.length-1;
		while(i<j) {
			String temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		for(int k=0;k<arr.length;k++)
		{
			arr[k]=new StringBuilder(arr[k]).reverse().toString();
		}
		
		for(String str:arr)
			System.out.print(str+" ");
		
		
	}

}
