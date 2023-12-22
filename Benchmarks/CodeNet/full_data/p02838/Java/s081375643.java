import java.util.*;

public class Main {

	static long MOD = 1000000007l;
	static int MAX_DIGIT = 60;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		long ans = 0;
		for (int d = 0; d < MAX_DIGIT; d++) {
			long n0 = 0, n1 = 0;
			for (int i = 0; i < N; i++) {
				if (((A[i] >> d) & 1) == 1) { // d桁目が1
					n1++;
				} else { // d桁目が0
					n0++;
				}
			}
			long tmp = (1l << d) % MOD; // 2^d
			long n = n0 * n1 % MOD;
			tmp = tmp * n % MOD;
			ans = (ans + tmp) % MOD;
		}
		System.out.println(ans);
	}
}
