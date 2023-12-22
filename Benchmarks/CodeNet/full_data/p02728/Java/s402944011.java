import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] adj = null;
	static int[] cnt = null;
	static int MOD = 1000000007;
	static HashMap<Integer, Integer>[] memo = null;
	static HashMap<Integer, Long>[] memo2 = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		adj = new ArrayList[N];
		for (int i = 0; i < N - 1; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			if ( adj[a[i]] == null ) {
				adj[a[i]] = new ArrayList<>();
			}
			adj[a[i]].add(b[i]);
			if ( adj[b[i]] == null ) {
				adj[b[i]] = new ArrayList<>();
			}
			adj[b[i]].add(a[i]);
		}
		sc.close();

		StringBuilder ans = new StringBuilder();
		for ( int i = 0 ; i < N ; i++ ) {
			cnt = new int[N];
			memo = new HashMap[N];
			memo2 = new HashMap[N];
			rec(i, -1);
			ans.append(rec2(i, -1));
			ans.append("\n");
		}

		System.out.println(ans.toString());
	}

	static int rec(int cur, int last) {
		if ( memo[cur] == null ) {
			memo[cur] = new HashMap();
		} else if ( memo[cur].containsKey(last) ) {
			return memo[cur].get(last);
		}
		for ( int next : adj[cur] ) {
			if ( next == last ) {
				continue;
			}
			cnt[cur] += rec(next, cur);
		}
		cnt[cur]++;
		memo[cur].put(last, cnt[cur]);
		return cnt[cur];
	}

	static long rec2(int cur, int last) {
		if ( memo2[cur] == null ) {
			memo2[cur] = new HashMap();
		} else if ( memo2[cur].containsKey(last) ) {
			return memo2[cur].get(last);
		}
		long ret = 1;
		int rem = cnt[cur] - 1;
		for ( int next : adj[cur] ) {
			if ( next == last ) {
				continue;
			}
			ret = (ret * combination(rem, cnt[next], MOD)) % MOD;
			rem = rem - cnt[next];
			ret = (ret * rec2(next, cur)) % MOD;
		}
		memo2[cur].put(last, ret);
		return ret;
	}

	static int[] xgcd(int a, int b) {
		int x0 = 1;
		int y0 = 0;
		int x1 = 0;
		int y1 = 1;
		while ( b != 0 ) {
			int q = a / b;
			int tmp = b;
			b = a % b;
			a = tmp;

			tmp = x1;
			x1 = x0 - q * x1;
			x0 = tmp;

			tmp = y1;
			y1 = y0 - q * y1;
			y0 = tmp;
		}
		return new int[] {a, x0, y0};
	}
	static int modInv(int a, int mod) {
		int[] xgcd = xgcd(a, mod);
		return (xgcd[1] + mod) % mod;
	}
	static int combination(int n, int a, int mod) {
		int aa = Math.min(a, n - a);
		long ret = 1;
		for ( int i = 0 ; i < aa ; i++ ) {
			ret = (ret * (n - i)) % mod;
			ret = (ret * modInv(i + 1, mod)) % mod;
		}
		return (int) ret;
	}

}
