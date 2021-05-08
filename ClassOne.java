package wacWorkshop1;

import java.util.Scanner;

public class ClassOne {

	public static void main(String[] args) {

//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println(4);

//		System.out.println(3);
//		System.out.print(4);
//		System.out.println(5);
//		System.out.print(6);
//		System.out.println();
//		System.out.print(7);

		Scanner sc = new Scanner(System.in);
		// input a number
//		System.out.println("Enter Your Age");
//		int a = sc.nextInt();
//		System.out.println("Your age is " + a);

		// input a string
//		System.out.println("Enter Your Name ?");
//		String name = sc.nextLine();
//		System.out.println("My Name is " + name);

		// swapping 2 variables

//		int a = 10, b = 20;
//		System.out.println("Before Swapping");
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After Swapping");
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);

//		int a = 7;
//		System.out.println(++a); // pre increment operator value increases by 1 and the used
//		System.out.println(a++); // post increment operator value used before increment by 1

		// unary operators
//		int a = 8;
//		System.out.println(a++); //8   //8
//		System.out.println(--a); //8   //8
//		System.out.println(a--); //7 /8 //
//		System.out.println(++a); //8  //8
//		System.out.println(a++);
//		System.out.println(a);  //8  //8

		// binary operators
//		System.out.println(7 / 3); // division //quotient
//		System.out.println(7 % 3); // modulus division //remainder

//		int a = 8, b = 0;
//		System.out.println(b / a);
//
//		System.out.println(a / b);

		// comparison operators

//		int a = 3, b = 4;
//		System.out.println(a > b); // false
//		System.out.println(a < b); // true
//		System.out.println(a >= b); // false
//		System.out.println(a <= b); // true
//		System.out.println(a == b); // false
//		System.out.println(a != b); // true

		// boolean operators

//		int a = 3, b = 4, c = 3;
//		System.out.println((a > b) && (a == c));  //false
//		System.out.println((a > b) || (a == c)); //true
//		System.out.println(!(a == c));           //false
//		System.out.println((a > b) ^ (a == c)); //true
//		System.out.println((a < b) ^ (a == c)); //false

		// if else
//		System.out.println("Enter Your Age ?");
//		int age = sc.nextInt();
//		if (age >= 18) {
//			System.out.println("Eligible To Vote");
//		} else {
//			System.out.println("Not Eligible To Vote");
//		}

		// float input

//		float a=sc.nextFloat();

		// double input

//		double a=sc.nextDouble();

		// character input

//		String s = sc.next();
//		char ch = s.charAt(0);
		// ashish chhabra
//		String s=sc.nextLine();
//		char ch=s.charAt(6);
//		System.out.println("Inputted Character is: " + ch);

		System.out.println("Enter the marks?");
		int mark = sc.nextInt();  //72
		if (mark > 90) {
			System.out.println("A Grade");
		} else if (mark > 75) {
			System.out.println("B Grade");
		} else if (mark > 65) {
			System.out.println("C Grade");
		} else {
			System.out.println("D Grade");
		}
	}

}
// Output in Console

// Hello World Hello World

// 3
// 45
// 6
// 7