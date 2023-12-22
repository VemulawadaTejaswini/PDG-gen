package aBC162_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 != 0 && a[i] % 5 != 0) {
				sum += a[i];
			}
		}
		System.out.println(sum);

	}

}
