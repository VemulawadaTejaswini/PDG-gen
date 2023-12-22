import java.io.*;
import java.util.*;

class Main {

	static final int M = 1000000007;

	private static int[] counts;

	private static void factorize(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i != 0) continue;
			int count = 0;
			while (n % i == 0) {
				count++;
				n /= i;
			}
			counts[i] += count;
		}
		if (n != 1) {
			counts[n]++;
		}
	}


	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		counts = new int[N + 1];

		for (int i = 2; i <= N; i++) {
			factorize(i);
		}

		long a = 1;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) continue;
			a = (a * (counts[i] + 1)) % M;
		}

		System.out.println(a);
	}
}
