import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		long[][] curr = new long[n][n];
		long[][] next = new long[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i] > a[j])
					curr[i][j] = 1;
			}
		}
		long half = inverse(2,mod);

		for(int i=0; i<q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=0; j<n; j++) {
				if(j!=y-1) {
					next[x-1][j] = (half * curr[x-1][j] % mod + half * curr[y-1][j] % mod)%mod;
					next[j][x-1] = (half * curr[j][x-1] % mod + half * curr[j][y-1] % mod)%mod;
				}
				if(j!=x-1) {
					next[y-1][j] = (half * curr[y-1][j] % mod + half * curr[x-1][j] % mod)%mod;
					next[j][y-1] = (half * curr[j][y-1] % mod + half * curr[j][x-1] % mod)%mod;
				}
				next[y-1][x-1] = (half * curr[y-1][x-1] % mod + half * curr[x-1][y-1] % mod)%mod;
				next[x-1][y-1] = (half * curr[x-1][y-1] % mod + half * curr[y-1][x-1] % mod)%mod;
			}
		curr = next;
//		for(int g=0; g<n; g++) {
//			for(int h=0; h<n; h++) {
//				System.out.println(bin_exp(2,i+1,mod)*next[g][h]%mod);
//			}
//		}
		next = new long[n][n];
		}
		long expectation = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				expectation = (expectation + curr[i][j]) %mod;
			}
		}
		System.out.println(expectation*bin_exp(2,q,mod)%mod);
	}
	
	public static long bin_exp(long base, long exp, long mod) {
		if(exp == 0)
			return 1;
		return bin_exp(base*base%mod, exp/2, mod) * (exp%2 == 1? base : 1) % mod;
	}
	
	public static long inverse(long a, long mod) {
		return bin_exp(a,mod-2,mod);
	}
}