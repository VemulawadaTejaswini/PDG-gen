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
		int cnt[] = new int[m];
		int ans[] = new int[n];
		ans[0] = a[0] % m;
		cnt[ans[0]]++;
		for(int i = 1; i < n; ++i) {
			ans[i] = ans[i - 1];
			ans[i] += a[i] % m;
			ans[i] %= m;
			cnt[ans[i]]++;
		}

		long ans2 = cnt[0];
		for(int i = 0; i < m; ++i) {
			ans2 += comb(cnt[i], 2);
		}
		System.out.println(ans2);
	}

}
