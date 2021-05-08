package wacWorkshop1;

import java.util.Scanner;

public class PascalTrianglePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 0;
		while (row < n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while (cst < nst) {
				System.out.print(ncr(row, cst) + " ");
				cst++;
			}

			System.out.println();
			row++;
			nst++;
			nsp--;
		}

	}

	public static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}

	public static int ncr(int n, int r) {
		return fact(n) / (fact(n - r) * fact(r));
	}

}
