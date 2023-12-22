import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	static int[] A = new int[N+1];
	static int[] B = new int[M+1];
	static final int MOD = 1_000_000_007;
	public static void main(String[] args) {
		A[0] = -1;
		B[0] = -1;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 1; i <= M; i++) {
			B[i] = sc.nextInt();
		}
		if (Arrays.stream(A).distinct().count() < A.length || Arrays.stream(B).distinct().count() < B.length) {
			System.out.println(0);
			return;
		}
		Arrays.sort(A);
		Arrays.sort(B);
		long ans = 1;
		int a_placed = 0;
		int b_placed = 0;
		for (int num = N*M; num > 0; num--) {
			if (A[N - a_placed] == num && B[M - b_placed] == num) {
				a_placed++;
				b_placed++;
			} else if (A[N - a_placed] == num) {
				a_placed++;
				ans = mul(ans, b_placed);
			} else if (B[M - b_placed] == num) {
				b_placed++;
				ans = mul(ans, a_placed);
			} else {
				ans = mul(ans, a_placed*b_placed - (N*M-num));
			}
			if (ans == 0) {
				break;
			}
		}
		System.out.println(ans);
	}
	static long mul(long x, long y) {
		return x*y%MOD;
	}
}