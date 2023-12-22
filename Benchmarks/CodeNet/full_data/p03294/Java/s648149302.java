
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			max = lcm(a[i], max);
		}

		int sum = 0;
		for (int i : a) {
			sum += (max - 1) % i;
		}

		System.out.println(sum);

	}

	static int lcm(int a, int b) {
		int temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return (int) (c / b);
	}
}
