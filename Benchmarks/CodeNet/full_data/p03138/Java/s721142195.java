import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		boolean[] b = new boolean[64];
		for(int i = 63; i >= 0; i--) {
			if(k % 2 != 0) {
				b[i] = true;
			}
			k /= 2;
		}
		
		int[] c1 = new int[64];
		int[] c0 = new int[64];
		for(int i = 0; i < 64; i++) {
			c1[i] = 0;
			c0[i] = 0;
		}
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			for(int j = 63; j >= 0; j--) {
				if(a % 2 == 0) {
					c0[j]++;
				}else {
					c1[j]++;
				}
				a /= 2;
			}
		}
		
		long[] dp = new long[64];
		dp[63] = Math.max(c0[63], c1[63]);
		for(int i = 62; i >= 0; i--) {
			dp[i] = dp[i + 1] + (long)Math.pow(2, 63 - i) * Math.max(c0[i], c1[i]);
		}
		
		long ans = 0;
		long tmp = 0;
		boolean free = false;
		for(int i = 0; i < 64; i++) {
			tmp *= 2;
			if(b[i] || free) {
				ans = Math.max(ans, tmp + dp[i]);
				tmp += Math.max(c1[i], c0[i]);
				free = free || c0[i] >= c1[i];
			}else {
				tmp += c1[i];
			}
		}
		ans = Math.max(ans, tmp);
		
		System.out.println(ans);
	}
}