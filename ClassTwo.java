package wacWorkshop1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassTwo {

	public static void main(String[] args) {

		// FizzBuzz Another way
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String res = "";
//		if (n % 3 == 0) {
//			res = res + "Fizz";
//		} 
//		if (n % 5 == 0) {
//			res = res + "Buzz";
//		} 
//		
//		System.out.println(res);

		// ternary operator
		// ?:

//		System.out.println("Enter your age");
//		int age = sc.nextInt();
//		System.out.println(age >= 18 ? "Eligible" : "Not Eligible");

		// switch case

//		System.out.println("Enter the first number");
//		int a = sc.nextInt();
//		System.out.println("Enter the second number");
//		int b = sc.nextInt();
//		System.out.println("Enter the Opertor");
//		char ch = sc.next().charAt(0);
//		System.out.println("Result:");
//		switch (ch) {
//		case '+': {
//			System.out.println(a + b);
//			break;
//		}
//		case '-': {
//			System.out.println(a - b);
//			break;
//		}
//		case '*': {
//			System.out.println(a * b);
//			break;
//		}
//
//		case '/': {
//			System.out.println(a / b);
//			break;
//		}
//
//		case '%': {
//			System.out.println(a % b);
//			break;
//		}
//
//		default: {
//			System.out.println("Invalid Operation");
//		}
//		}

		// braces
//		int n = sc.nextInt();
//		if (n % 2 == 0)
//			System.out.println("Even");
//		else
//			System.out.println("Odd");

		// Loops

//		System.out.println("hello world");
//		System.out.println("hello world");
//		System.out.println("hello world");
//		System.out.println("hello world");
//		System.out.println("hello world");

		// sum of n natural numbers
//		System.out.println("Enter the n ?");
//		int n = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		System.out.println((n * (n + 1)) / 2);

		// reverse for loop
//		for (int i = 5; i >= 1; --i) {
//			System.out.println("Hello world");
//		}

//		System.out.println("Enter the number");
//		int num = sc.nextInt();
//		for (int i = 1; i <= 10; i++)
//			System.out.println(num + " * " + i + " = " + num * i);

//		System.out.print("Hello World\n");
//		System.out.println("Hello World\t 5");

//		int i = 1;
//		for (; i <= 5;) {
//			System.out.println("Hello");
//			i++;
//		}

		// while loop

//		int i = 1;
//		while (i <= 5) {
//			System.out.println(i);
//			System.out.println("Hello World");
//			++i;
//		}
//		System.out.println(i);

		// Do while Loop

//		int i = 1;
//		int sum = 0;
//		do {
//			sum = sum + i;
//			i++;
//		} while (i <= 5);
//		System.out.println(sum);

		// Break and continue

//		for (int i = 1; i <= 10; i++) {
//			if (i == 6)
//				break;
//			System.out.println(i);
//		}

//		for (int i = 1; i <= 10; i++) {
//			if (i == 6)
//				continue;
//			System.out.println(i);
//		}

//		System.out.println("Enter the number? ");
//		int n = sc.nextInt();
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				break;
//			}
//		}

//		int a = 2, b = 3;
//		int s=sum(a,b);
//		System.out.println(s);

//		System.out.println("Enter the number to check whether it is prime or not?");
//		int n = sc.nextInt();
//		System.out.println(prime(n));

		// Combination formula
//		System.out.println("Enter the values");
//		int n = sc.nextInt();
//		int r = sc.nextInt();
//		int ans = (fact(n) / (fact(n - r) * fact(r)));
//		System.out.println(ans);
//

//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		for(int i=0;i<arr.length;i++)
//			arr[i]=sc.nextInt();

//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

		// n case
//		int n = sc.nextInt();
//		int count = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0)
//				count++;
//		}
//
//		if (count == 2)
//			System.out.println("Prime");
//		else
//			System.out.println("Not Prime");

		// n/2 case

//		boolean flag = false;
//		for (int i = 2; i <= n / 2; i++) {
//			if (n % i == 0) {
//				flag = true;
//				break;
//			}
//		}

		// sqrt(n) case
//		boolean flag = false;
//		for (int i = 2; i * i <= n; i++) {
//			if (n % i == 0) {
//				flag = true;
//				break;
//			}
//		}

		// sqrt of a number
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		System.out.println("Enter the number of decimal places");
//		int p = sc.nextInt();
//		double res = 0.0;
//		for (int i = 1; i * i <= n; i++) {
//			res = i;
//		}
//		double inc =  0.1;
//		for (int i = 0; i < p; i++) {
//
//			while (res * res <= n) {
//				res = res + inc;
//			}
//			
//
//			res = res - inc;
//			inc = inc / 10;
//
//		}
//		System.out.println((float)res);

		// Maximum of an array

//		int[] arr = new int[5];
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			max = arr[i] > max ? arr[i] : max;
//		}
//		System.out.println(max);

		// Second way of declaration
		// reversing the array
//		int[] arr = { 50, 40, 30, 20, 10 };
//		int[] ar = new int[arr.length];
//		for(int i=arr.length-1,j=0;i>=0&&j<ar.length;i--,j++) {
//				ar[j]=arr[i];
//		}
//		for(int i=0;i<ar.length;i++)
//			System.out.println(ar[i]);

		// swapping second way
//		int j = 0;
//		int k = arr.length - 1;
//		while (j < k) {
//			int temp = arr[j];
//			arr[j] = arr[k];
//			arr[k] = temp;
//			j++;
//			k--;
//		}

		// sorting
//		Arrays.sort(arr);
//		
//		for (int i = 0; i < arr.length; i++)
//			System.out.println(arr[i]);
//		char ch='Z';
//		System.out.println((int)ch);

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);

		// For Each Loop

//		int[] arr = { 1, 2, 3, 4, 5 };
//		for (int i : arr)
//			System.out.println(i);
//		for(int i:list)
//			System.out.println(i);

//		System.out.println(list.get(4));
//		System.out.println(list);
//		list.set(2, 35);
//		System.out.println(list);

//		System.out.println(list);
//		list.remove(2);
//		System.out.println(list);

//		System.out.println(list.isEmpty());

//		System.out.println(list.size());
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);

//		System.out.println(list.contains(35));
//		System.out.println(list.indexOf(30));
//		System.out.println(list.lastIndexOf(30));
//		System.out.println(list.indexOf(35));

//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));

//		String name = "Niloy";
//		String name1 = new String("Niloy");

//		String str = "Corona";
//		System.out.println(str.charAt(4));
//		System.out.println(str.substring(1, 6));
//		System.out.println(str.substring(6));
//		System.out.println(str + "Delhi");
//		str=str.concat("Delhi");
//		System.out.println(str);
//		System.out.println(str.indexOf('o'));
//		System.out.println(str.lastIndexOf('o'));
//		System.out.println(str.startsWith("Co"));

//		String str1="Hello";
//		String str2=new String("hello");
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));

//		String str1="HELLO";
//		System.out.println(str1.toLowerCase());
//		str1=str1.replace('E', 'A');
//		System.out.println(str1);

		// Immutable
//		String s="hello";
//		s=s+"Bye";

		// Mutable String Builder

//		StringBuilder sb=new StringBuilder("corona");
//		sb.append("Go");
//		System.out.println(sb);
//		sb.insert(2, 'd');
//		System.out.println(sb);
//		sb.replace(1,3, "tomy");
//		System.out.println(sb);
//		sb.delete(1,3);
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
//		System.out.println(sb.length());
//		String s="Niloy";
//		String res="";
//		for(int i=s.length()-1;i>=0;i--)
//			res=res+s.charAt(i);
//		System.out.println(res);

		// Palindrome
//		String s="racecar";
//		int i=0;
//		int j=s.length()-1;
//		boolean flag=false;
//		while(i<j) {
//			if(s.charAt(i++)!=s.charAt(j--)) {
//				flag=true;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("Not Palindrome");
//		}else {
//			System.out.println("palindrome");
//		}

		// Random
//		System.out.println(Math.random());

//		Random r = new Random();
//		int value = r.nextInt(6 - 1 + 1) + 1;
//		System.out.println(value);
		
		
		
		
		
		
		
		

		// End of main
	}
//
//	public static int fact(int n) {
//		int f = 1;
//		for (int i = 1; i <= n; i++)
//			f *= i;
//		return f;
//	}

//	public static int sum(int a, int b) {
//		return a+b;
//	}

//	public static String prime(int n) {
//		int flag = 0;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				flag = 1;
//				break;
//			}
//		}
//		if (flag == 0) {
//			return "Prime";
//		} else {
//			return "Not Prime";
//		}
//	}

}

// 15 input  res=""
// 15%3==0 true res=""+"Fizz"  res=Fizz;
// 15%5==0 true res=res+"Buzz"  "Fizz"+"Buzz" ="FizzBuzz";
