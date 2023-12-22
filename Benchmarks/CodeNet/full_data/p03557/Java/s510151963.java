import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N], B = new long[N], C = new long[N];
		for (int i = 0; i < 3 * N; i++) {
			if (i < N) {
				A[i] = scn.nextLong();
			} else {
				if (i < 2 * N) {
					B[i-N] = scn.nextLong();
				} else {
					C[i-2*N] = scn.nextLong();
				}
			}
		}

		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long BC[] = new long[N+1];
		for (int i = 0; i < N; i++) {
			long bb = B[i];
			int n = getNum(bb, C);
			BC[i+1] = N-n + BC[i];
		}

		long AB[] = new long[N];
		for (int i = 0; i < N; i++) {
			long aa = A[i];
			int n = getNum(aa, B);
			AB[i] = BC[N] - BC[n];
		}

		long ans = 0;
		for(int i = 0;i < N;i++) {
			ans += AB[i];
		}
		System.out.println(ans);
	}

	public static int getNum(long v, long A[]) {
		int first = 0;
		int last = A.length - 1;

		while (first - last > 5) {
			int buf = (first + last) / 2;
			if (A[buf] > v) {
				last = buf;
			} else {
				first = buf;
			}
		}
		int ans = first;
		while (ans < first + 10 && ans < A.length) {
			if (A[ans] > v) {
				break;
			}
			ans++;
		}

		return ans;
	}
}
