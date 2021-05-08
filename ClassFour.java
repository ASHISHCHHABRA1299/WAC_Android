package wacWorkshop1;

//import java.util.ArrayList;
import java.util.Scanner;

//class student{
//	
//	//Data Abstraction
//	
//	 private String name;
//	 private int roll;
//	
//	student(){
//		
//	}
//	
//	student(String name, int roll) {	
//		this.name = name;
//		this.roll = roll;
//	}
//
//	//Getters and setters
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getRoll() {
//		return roll;
//	}
//
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//	
//	
//	
//	
//	
//	
//}

//class Person{
//	String name;
//	int age;
//	
//	Person(){
//		System.out.println("In Person's Class");
//	}
//	
//	
//	
//	Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//		System.out.println("In Parametrised constructor");
//	}
//
//
//
//	public void displayInfo() {
//		System.out.println(this.name+" "+this.age);
//	}	
//}
//
//class student extends Person{
//	
//	int marks=0;
//	
//	student(){
//		super("Niloy",2);
//		System.out.println("In student's Class");
//	}
//	public void displaymarks() {
//		System.out.println(super.name+" "+super.age);
//		System.out.println(this.marks);
//	}
//}

//abstract class Animal {
//
//	abstract void sound();
//
//	public void eat() {
//		System.out.println("I can eat");
//	}
//
//}
//
//class dog extends Animal {
//
//	@Override
//	void sound() {
//		System.out.println("I make sound");
//
//	}
//
//}

class student implements Person,Marks{

	@Override
	public void setname() {
		
	}

	@Override
	public void setage() {
		
		
	}

	@Override
	public void setmark() {
		
	}
	
}

public class ClassFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Diamond Pattern

//		int n = sc.nextInt();
//		int row = 1;
//		int nst = 1;
//		int nsp = n - 1;
//		while (row <= 2 * n - 1) {
//			int csp = 1;
//			while (csp <= nsp) {
//				System.out.print(" ");
//				csp++;
//			}
//			int cst = 1;
//			while (cst <= nst) {
//				System.out.print("* ");
//				cst++;
//			}
//			if (row >= n) {
//				nsp++;
//				nst--;
//			} else {
//				nsp--;
//				nst++;
//			}
//
//			System.out.println();
//			row++;
//
//		}

		// second largest Element
//		int[] arr = { 6, 4, 2, 1, 5, 6 }; // largest = 7 second-largest=6
//		int largest = Integer.MIN_VALUE;
//		int slargest = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				slargest = largest;
//				largest = arr[i];
//			} else if (arr[i] > slargest && arr[i] != largest) {
//				slargest = arr[i];
//			}
//		}
//		System.out.println(largest);
//		System.out.println(slargest);

		// subarray
//		int[] arr = { 1, 2, 3, 4 };
//		for(int start=0;start<arr.length;start++) {
//			for(int end=start;end<arr.length;end++) {
//				for(int k=start;k<=end;k++) {
//					System.out.print(arr[k]+" ");
//				}
//				System.out.println();
//			}
//		}

		// Merge Two Lists

//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list2.add(5);
//		list2.add(6);
//		list2.add(7);
//		System.out.println(list1);
//		System.out.println(list2);

		// Method1
//		for (int a : list2)
//			list1.add(a);
//		System.out.println(list1);
//		System.out.println(list2);

		// Method2
//		list1.addAll(list2);
//		System.out.println(list1);

		// Final Variable

//		final int a=2;
//		
//		a=6;
//		
//		System.out.println(a);

//		student s=new student("Ashish",1);
//		System.out.println(s.getName());
//		System.out.println(s.getRoll());
//		s.setName("Niloy");
//		s.setRoll(2);
//		System.out.println(s.getName());
//		System.out.println(s.getRoll());

//		student s =new student();
//		s.name="Ashish";
//		s.age=15;
//		s.marks=80;
//		s.displayInfo();
//		s.displaymarks();

//		Animal d = new dog();
//		d.sound();

	}

}
