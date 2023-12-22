import java.io.*;
import java.util.*;
 
class Main {
 
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		solve(N, A);
	}
 
	static void solve(int N, long[] A) {
		long[] sum = new long[N + 1];
		for (int i = 0; i < N; i++) {
			sum[i + 1] = sum[i] + A[i];
		}
 
		int l = 1;
		int r = 3;
		long answer = Long.MAX_VALUE;
		for (int i = 2; i < N - 1; i++) {
			while (l < i - 1 && Math.abs(sum[i] - sum[l] * 2) >
					Math.abs(sum[i] - sum[l + 1] * 2)) {
				l++;
			}
 
			while (r < N - 1 && Math.abs(sum[N] - sum[i] - (sum[r] - sum[i]) * 2) >
					Math.abs(sum[N] - sum[i] - (sum[r + 1] - sum[i]) * 2)) {
				r++;
			}
 
			long[] a = new long[]{sum[l], sum[i] - sum[l], sum[r] - sum[i], sum[N] - sum[r]};
			Arrays.sort(a);
 
			answer = Math.min(answer, Math.abs(a[3] - a[0]));
		}
 
		System.out.println(answer);
	}
}