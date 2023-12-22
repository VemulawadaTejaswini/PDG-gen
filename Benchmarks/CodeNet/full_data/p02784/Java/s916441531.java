import java.io.*;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long H;
		H = sc.nextLong();
		long N;
		N = sc.nextLong();
		long sum = 0;
		long[] A = new long[(int) (N)];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			sum += A[i];
		}

		if (H > sum) {
			System.out.println(NO);
		} else {
			System.out.println(YES);
		}
	}
}
