import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] P = new long[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextLong();
		}

		long min = Long.MAX_VALUE;
		int count = 0;
		for (int i = 0; i < P.length; i++) {
			if (min > P[i]) {
				min = P[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
