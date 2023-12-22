import java.util.*;

public class Main {

	final static int r = 1000000000 + 7;
	
	public static int digitBit(long a) {
		if(a < 0)return -1;
		int ans = 1;
		while(a > 1){
			a >>= 1;
			++ans;
		}
		return ans;
	}

	public static long solve(long a[], long max) {
		long ans = 0, tmp = 0;
		int maxdigit = digitBit(max), n = a.length;
		long current = 1;
		for(int i = 0; i < maxdigit; ++i){
			int cnt = 0;
			for(int j = 0; j < n; ++j){
				long target = a[j];
				tmp = current & target;
				if(tmp > 0)++cnt;
			}
			tmp = cnt * (n - cnt);
			tmp %= r;
			tmp *= current;
			tmp %= r;
			ans += tmp;
			ans %= r;
			current *= 2;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long max = 0;
		for (int i = 0; i < n; ++i){
			a[i] = sc.nextLong();
			max = Math.max(a[i], max);
		}
		sc.close();
		long ans = solve(a, max);
		System.out.println(ans);
	}
}
