import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		final int N= 13;
		long[] dp = new long[N];

		dp[0] = 1;
		long mod = 1000000007L;

		int mul = 1;
		for (int i= S.length() -1; i >= 0; i--){

			long[] nextDP = new long[N];

			char c = S.charAt(i);
			if (c == '?'){
				for (int k=0; k < 10; k++){
					for (int j = 0; j < N; j++){
						nextDP[(k * mul + j) % N] += dp[j];
						nextDP[(k * mul + j) % N] %= mod;
					}
				}
			} else {
				int k = c - '0';
				for (int j = 0; j < N; j++){
					nextDP[(k * mul + j) % N] += dp[j];
					nextDP[(k * mul + j) % N] %= mod;
				}
			}
			dp = nextDP;

			mul *= 10;
			mul %= N;
		}
		System.out.println(dp[5]);
	}
}