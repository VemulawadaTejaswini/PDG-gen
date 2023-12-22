import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long sum = 0;
		for (int i = 0; i < n / 2; i++) {
			sum -= a[i];
		}
		for (int i = n / 2; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		if (n % 2 == 0) {
			int tmp = a[0];
			for (int i = 0; i < n - 1; i++) {
				if (i % 2 == 0) {
					System.out.println(a[n - i / 2 - 1] + " " + tmp);
					tmp = a[n - i / 2 - 1] - tmp;
				} else {
					System.out.println(a[i / 2 + 1] + " " + tmp);
					tmp = a[i / 2 + 1] - tmp;
				}
			}
		} else {
			int tmp = a[n - 1];
			for (int i = 0; i < n - 1; i++) {
				if (i % 2 != 0) {
					System.out.println(a[n - i / 2 - 2] + " " + tmp);
					tmp = a[n - i / 2 - 2] - tmp;
				} else {
					System.out.println(a[i / 2] + " " + tmp);
					tmp = a[i / 2] - tmp;
				}
			}
		}
	}
}

