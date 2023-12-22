import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] b = new int[n];
		int[] C = new int[n];
		int ans = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			C[i] = sc.nextInt();
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (A[j] < B[i]) {
					b[i] = j + 1 + sum;
					sum += j + 1;
					break;
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (C[i] > B[j]) {
					ans += b[j];
					break;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}