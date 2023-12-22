import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}

		long answer = 0;
		if (a[0] + a[1] > x) {
			if (a[0] >= x) {
				answer += a[1];
				answer += (a[0] - x);
				a[1] = 0;
				a[0] = x;
			} else {
				answer += a[1] - (x - a[0]);
				a[1] = (x - a[0]);
			}
		}


		long current = a[1];
		for (int i = 1; i < a.length - 1; i++) {
			if (current + a[i + 1] > x) {
				answer += a[i + 1] - (x - current);
				a[i + 1] = (x - current);
			}
			current = a[i + 1];
		}
		System.out.println(answer);
	}
}
