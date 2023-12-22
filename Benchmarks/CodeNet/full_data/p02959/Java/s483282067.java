import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] A = new long[n + 1];
		long[] B = new long[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLong();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextLong();
		}
		long ans = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] > A[i]) {
				ans += A[i];
				long diff = B[i] - A[i];
				if (diff > A[i + 1]) {
					ans += A[i + 1];
					A[i + 1] = 0;
				} else {
					A[i + 1] -= diff;
					ans += diff;
				}

			} else {
				ans += B[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}
}