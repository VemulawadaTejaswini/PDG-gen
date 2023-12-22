
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int mod = 1_000_000_007;

	class P{
		int v;
		int p;
		P(int v, int p){
			this.v=v;
			this.p=p;
		}
	}
	private long pow(long a, int k) {
		if(k==0) return 1;
		if(k%2==0) {
			long tmp = pow(a, k/2);
			tmp *= tmp;
			tmp %= mod;
			return tmp;
		}else {
			long tmp = pow(a, k-1);
			tmp *= a;
			tmp %= mod;
			return tmp;
		}
	}

	private long inv(long a) {
		return pow(a, mod-2);
	}


	long fact[];
	long ifact[];

	private void init(int n) {
		fact = new long[n+1];
		ifact = new long[n+1];
		fact[0]=1;
		for(int i=1; i<=n; i++) {
			fact[i] = fact[i-1]*i;
			fact[i] %= mod;
		}
		ifact[n] = inv(fact[n]);
		for(int i=n-1; i>=0; i--) {
			ifact[i] = ifact[i+1] * (i+1);
			ifact[i] %= mod;
		}
	}

	private long perm(int a, int k) {
		if(a<k) return 0;
		long ret = fact[a] * ifact[a-k];
		ret %= mod;
		return ret;
	}


	ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	long ans = 1;
	int n;
	int k;
	private void dfs(int r) {
		ArrayDeque<P> stack = new ArrayDeque<>();
		stack.push(new P(r,-1));
		while(!stack.isEmpty()) {
			P p = stack.pop();
			int v =p.v;
			if(v==r) {
				ans *= perm(k, g.get(v).size()+1);
				ans %= mod;
			}else {
				ans *= perm(k-2, g.get(v).size()-1);
				ans %= mod;
			}
			for(int u : g.get(v)) {
				if(u==p.p) continue;
				stack.push(new P(u,v));
			}
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		for(int i=0; i<n; i++) {
			g.add(new ArrayList<>());
		}
		init(100005);
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			a--;b--;
			g.get(a).add(b);
			g.get(b).add(a);
		}
		dfs(0);
		System.out.println(ans);
		sc.close();
	}
}
