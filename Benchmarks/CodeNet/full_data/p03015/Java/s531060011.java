import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String L = sc.next();
		int N = L.length();
		int MOD = 1000000007;
		long[] dp1 = new long[N+1];
		long[] dp2 = new long[N+1];
		dp2[0] = 1;
		for(int i = 1; i <= N; i++) {
			if(L.charAt(i-1) == '1') {
				dp1[i] = (dp1[i-1]*3+dp2[i-1]) % MOD;
				dp2[i] = dp2[i-1] * 2 % MOD;
			}
			else {
				dp1[i] = dp1[i-1] * 3 % MOD;
				dp2[i] = dp2[i-1];
			}
		}
		System.out.println((dp1[N]+dp2[N]) % MOD);
	}

}