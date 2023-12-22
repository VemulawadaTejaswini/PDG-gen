import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n + 1];
		int[] B = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] > A[i]) {
				int diff = B[i] - A[i];
				if (diff > A[i + 1]) {
					ans += A[i] + A[i + 1];
					A[i + 1] = 0;
				} else {
					A[i + 1] -= diff;
					ans += B[i];
				}

			} else {
				ans += B[i];
			}
		}
		System.out.println(ans);
		sc.close();
	}

}