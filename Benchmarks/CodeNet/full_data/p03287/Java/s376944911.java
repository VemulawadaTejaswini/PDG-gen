import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static long comb(int n, int r) {
		if(n < r)return 0;
		if(n == r)return 1;
		long ans = 1;
		for(int i = 1; i <= r; ++i) {
			ans *= (n - i + 1);
			ans /= i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		int ans[] = new int[n + 1];
		ans[0] = a[0] % m;
		for(int i = 1; i < n; ++i) {
			ans[i] = ans[i - 1];
			ans[i] += a[i] % m;
			ans[i] %= m;
		}
		ans[n] = m;
		Arrays.sort(ans);
		long ans2 = 0;
		int t = ans[0];
		int cnt = 0;
		for(int i = 0; i <= n; ++i) {
			if(ans[i] == t)++cnt;
			else {
				if(t == 0)ans2 += cnt;
				ans2 += comb(cnt, 2);
				cnt = 1;
				t = ans[i];
			}
		}
		System.out.println(ans2);
	}

}
