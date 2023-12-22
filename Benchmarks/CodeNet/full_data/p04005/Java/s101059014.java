

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(0);
				return;
			}
		}
		Arrays.sort(a);
		// System.out.println(Arrays.toString(a));
		int s = a[0] * a[1] * (a[2] / 2);
		int t = a[0] * a[1] * (a[2] - a[2] / 2);
		// System.out.println("s:" + s);
		// System.out.println("t:" + t);
		System.out.println(Math.abs(s - t));
	}
}
