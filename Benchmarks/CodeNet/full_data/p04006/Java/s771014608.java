import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int[] min = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			min[i] = a[i];
		}

		long answer = Long.MAX_VALUE;
		for (int k = 0; k < n; k++) {
			long cost = k * x;
			for (int i = 0; i < n; i++) {
				min[i] = Math.min(min[i], a[(i - k + n) % n]);
				cost += min[i];
			}
			answer = Math.min(answer, cost);
		}

		System.out.println(answer);
	}
}
