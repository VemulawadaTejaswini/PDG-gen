import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 1; i <= k; i++) {
			int red = n - k;
			int div = comb(k - 1, i - 1);
			if(red < i - 1) {
				continue;
			}
			red -= i - 1;
			long ans = comb(div, (i - 1));
			ans = ans * comb(red + i, i) % MOD;
			System.out.println(ans);
		}
	}
	int comb(int n, int r) {
		long ans = 1;
		if(n < r) {
			return (int)ans;
		}
		for(int i = 1; i <= r; i++) {
			ans *= n - i + 1;
			ans /= i;
			ans %= MOD;
		}
		
		return (int)ans;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
