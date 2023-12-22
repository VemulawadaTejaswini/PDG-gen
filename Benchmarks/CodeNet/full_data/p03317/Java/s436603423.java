import java.util.*;

public class Main {

	public static long solve(final int n, final int k, int s, int g) {
		long ans = 0;
		if(s <= 0 && g >= n - 1)return 0;
		if(s <= 0)return (n - g + k - 2) / (k - 1);
		if(g >= n - 1)return (s + k - 2) / (k - 1);
		if(s == g) {
			ans = 1 + solve(n, k, s, g + k - 1);
			for(int i = 1; i < k; ++i) {
				long tmp = 1 + solve(n, k, s - i, g + k - i - 1);
				ans = Math.min(tmp,  ans);
			}
			return ans;
		}
		
		s += k - 2;
		g = n - g + k - 2;
		ans += (long)s / (long)(k - 1);
		ans += (long)g / (long)(k - 1);
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		int p = 0;
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			if(a[i] == 1)p = i;
		}
		sc.close();
		long ans = solve(n, k, p, p);
		System.out.println(ans);
	}

}
