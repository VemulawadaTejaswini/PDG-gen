import java.util.*;

public class Main {

	final static long r = 1000000000 + 7;
	final static int MAX = 60;

	public static long solve(long a[]) {
		long ans = 0, tmp = 0;
		int n = a.length;
		long current = 1;
		for(int i = 0; i < MAX; ++i){
			int cnt = 0;
			for(int j = 0; j < n; ++j){
				long target = a[j];
				tmp = current & target;
				if(tmp == 0)++cnt;
			}
			tmp = cnt * (n - cnt);
			tmp %= r;
			tmp *= current;
			tmp %= r;
			ans += tmp;
			ans %= r;
			current <<= 1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextLong();
		sc.close();
		long ans = solve(a);
		System.out.println(ans);
	}
}
