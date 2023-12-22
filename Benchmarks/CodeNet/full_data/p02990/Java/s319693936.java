
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int mod = 1000000007;
		long ans = 0;
		for(int i = 1; i <= k; i++) {
			ans = cnb(k-1, i-1);
			ans %= mod;
			//System.out.print(ans + " ");
			ans *= cnb(n-k+1, i);
			//System.out.print(n-k+1 + " " + i + " ");
			ans %= mod;
			System.out.println(ans);
		}
		sc.close();
	}
	public static long cnb(int m, int n) {
		long ans = 1;
		int mod = 1000000007;
		for(int i = 1; i <= n; i++) {
			ans *= m-i+1;
			ans /= i;
			ans %= mod;
		}

		return ans;
	}
	public static long ppp(int m) {
		long ans = 1;
		for(int i = 1; i <= m; i++) {
			ans *= i;
		}
		return ans;
	}
}
