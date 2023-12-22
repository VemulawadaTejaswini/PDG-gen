import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] center = new long[N];
		PriorityQueue<Long> apq = new PriorityQueue<>();
		PriorityQueue<Long> bpq = new PriorityQueue<>(Comparator.reverseOrder());
		long asum = 0;
		for(int i=0; i<N; i++) {
			long a = sc.nextLong();
			apq.add(a);
			asum += a;
		}
		for(int i=0; i<N; i++) {
			center[i] = sc.nextLong();
		}
		long bsum = 0;
		for(int i=0; i<N; i++) {
			long b = sc.nextLong();
			bpq.add(b);
			bsum += b;
		}
		long[] amax = new long[N+1];
		amax[0] = asum;
		for(int i=0; i<N; i++) {
			asum += center[i];
			apq.add(center[i]);
			asum -= apq.poll();
			amax[i+1] = asum;
		}
		long[] bmin = new long[N+1];
		bmin[N] = bsum;
		for(int i=N-1; i>=0; i--) {
			bsum += center[i];
			bpq.add(center[i]);
			bsum -= bpq.poll();
			bmin[i] = bsum;
		}
		long ans = -Long.MAX_VALUE;
		for(int i=0; i<=N; i++) {
			ans = Math.max(ans, amax[i] - bmin[i]);
		}
		System.out.println(ans);
	}
	
	// print
	static void print(String s) {
		System.out.println(s);
	}
	
	// union find lib
	// usage:
	// 最初にinitを呼ぶ
	// root: 直接は呼ばないで
	// unite: まとめる
	// same: グループ判定
	static void init(int par[], int N) {
		for(int i=0; i<N; i++) {
			par[i] = i;
		}
	}
	
	static int root(int x, int [] par) {
		if(par[x] == x) {
			return x;
		} else {
			return (par[x] = root(par[x], par));
		}
	}
	
	static boolean same(int x, int y, int[] par) {
		return root(x, par) == root(y, par);
	}
	
	static void unite(int x, int y, int[] par) {
		x = root(x, par);
		y = root(y, par);
		if(x == y) return;
		par[x] = y;
	}
	
	// end union find lib
	
	// number lib
	
	static long lcm(long a, long b) {
		return a*(b/gcd(a, b));
	}
	
	static long gcd(long a, long b) {
		long ta = Math.max(a, b);
		long tb = Math.min(a, b);
		long tmp;
		while((tmp = ta%tb) != 0) {
			ta = tb;
			tb = tmp;
		}
		return tb;
	}
	
	static long modcomb(long n, long k, long mod) {
		if(k==1) {
			return n;
		}
		
		long ans = 1;
		for(long i=n; i>=n-k+1; i--) {
			ans = (ans * i)%mod;
		}
		for(long i=k; 0<i; i--) {
			ans = (ans * modpow(i, mod-2, mod)) % mod;
		}
		return ans;
	}
	
	static long modpow(long a, long b, long mod) {
		if(b==0) return 1;
		if(b%2==0) {
			long d = modpow(a, b/2, mod);
			return (d*d)%mod;
		} else {
			return (a*modpow(a, b-1, mod))%mod;
		}
	}
	
	static int disit(long a, long d) {
		int count = 0;
		while(a!=0) {
			a = a/d;
			count++;
		}
		return count;
	}
	
	// end number lib
}