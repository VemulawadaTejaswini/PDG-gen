import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		final long MOD = 1000000007;
		int R = N-K;
		for (int i = 1; i <= K; i++) {
			long ans = 1;
			if (R < i - 1) {
				ans = 0;
			} else if (i == 1) {
				ans = N-K+1;
			} else {
				ans = 1;
				for (int j = 1; j < i; j++) {
					ans *= (K - j);
					ans /= (j);
					ans %= MOD;
				}
				for(int j = 1;j <= i;j++) {
					ans *= (R+2-j);
					ans /= j;
					ans %= MOD;
				}
				ans%=MOD;
			}

			System.out.println(ans);
		}
	}

}
