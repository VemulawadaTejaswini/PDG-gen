import java.util.LinkedList;
import java.util.Scanner;

class NumTh{
	static long mod=1000000007; // 10e9 + 7
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
	static long LCM(long x, long y){
		return (x / GCD(x,y)) * y;
	}
	static int LCM(int x, int y) {
		return (int)LCM((long)x, (long)y);
	}
    // $a^x$ mod m
	static long pow(long a, long x, long m){
		if(x == 1) return a % m;
		else if(x % 2 == 0) return pow((a * a) % m, x / 2, m) % m;
		else return (a * pow((a * a) % m, x / 2, m)) % m;
	}
	static boolean ip(long x) {
		if(x == 1) return false;
		for(long i = 2; i * i <= x; i++) if(x % i == 0) return false;
		return true;
	}
	static long Perm(long n, long k) {
		if(n == 0) return 1;
		if(n < k) return 0;
		long ans = 1;
		for(long i = 0; i < k; i++) {
			ans *= (n - i);
			ans %= mod;
		}
		return ans;
	}
	static long Choose(long n, long k) {
		long res = 1;
		for(long i = n; i >= n - k + 1; i--) {
			res *= i; res %= mod;
			res *= inv(k - n + i, mod); res %= mod;
		}
		return res % mod;
	}
	static long inv(long a, long mod) {
		if(GCD(a, mod) != 1) return -1; // there is no inverse
		x = 0; y = 0;
		extGCD(a, mod, 0);
		return (x + mod) % mod;
	}
	/* Calculate the solution of ax + by = gcd(a, b) */
	// Usage: extgcd(a, b, 0)
	static long x = 0, y = 0;
	static long extGCD(long a, long b, int c) {
		long d = a;
		if(b != 0) {
			d = extGCD(b, a % b, (c + 1) % 2);
			if(c == 0) y -= (a / b) * x;
			else x -= (a / b) * y;
		}else {
			x = (c == 0) ? 1 : 0;
			y = (c == 0) ? 0 : 1;
		}
		return d;
	}
}
// if id == -1, the Node is root.
class Node{
	int id = -1;
	long occ_num = 1, can_choose = 0;
	LinkedList<Integer> child;
	public Node(int x) {
		id = x;
		child = new LinkedList<Integer>();
	}
}
class Edge{
	int s, t;
	public Edge(int _a, int _b) {
		s = _a; t = _b;
	}
}
public class Main{
	static LinkedList<Integer>[] tree;
	static long dfs(int K, int now, int from) {
		long can_color = (from == -1) ? K - 1 : K - 2;
		if(K < tree[now].size()) return 0; // ぬれない
		long ans = 1;
		for(int e : tree[now]) {
			if(e == from) continue;
			ans *= can_color;
			can_color--;
			ans %= NumTh.mod;
		}
		for(int e : tree[now]) {
			if(e == from) continue;
			ans *= dfs(K, e, now);
			ans %= NumTh.mod;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		tree = new LinkedList[N];
		for(int i = 0; i < N; i++) tree[i] = new LinkedList<Integer>();
		for(int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
			tree[a].add(b);
			tree[b].add(a);
		}
		long ans = dfs(K, 0, -1);
		ans *= K;
		System.out.println((ans) % NumTh.mod);
	}
}
