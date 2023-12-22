import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		//long cur = System.currentTimeMillis();
		new Main().run();
		//System.out.println(System.currentTimeMillis() - cur);
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		--A;
		--B;
		System.out.println(solve(A, B, N));
	}

	long solve(long A, long B, long N) {
		if (A > B) {
			A ^= B;
			B ^= A;
			A ^= B;
		}
		A = Math.max(A, 0);
		B = Math.max(B, 0);
		A = Math.min(A, N - 1);
		B = Math.min(B, N - 1);
		if ((B - A) % 2 == 0) {
			return (B - A) / 2;
		} else {
			long left, right;
			left = A + 1 + solve(0, B - (A + 1), N);
			right = (N - B) + solve(A + (N - B), N - 1, N);
			return Math.min(left, right);
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
