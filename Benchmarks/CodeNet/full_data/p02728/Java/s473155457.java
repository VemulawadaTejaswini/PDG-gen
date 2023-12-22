import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007;
	static long modpow(long n, long y){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}
	static long modinv(long n){
		return modpow(n , MOD - 2);
	}
	static class Edge{
		int src;
		int dst;
		int idx;
		public Edge(int src , int dst , int idx) {
			this.src = src;
			this.dst = dst;
			this.idx = idx;
		}
	}
	static class Vertex{
		List<Edge> adj;
		public Vertex() {
			adj = new ArrayList<Edge>();
		}
	}
	static long[] rec(int cur , Vertex[] vs , long memo[] , long memoSize[] , int parent , List<Integer> visitOrder){
		visitOrder.add(cur);
		long size = 1;
		for(Edge e : vs[cur].adj){
			if(e.dst == parent){
				continue;
			}
			if(memo[e.idx] < 0){
				long r[] = rec(e.dst , vs , memo , memoSize , cur , visitOrder);
				memoSize[e.idx] = r[0];
				memo[e.idx] = r[1];
			}
			size += memoSize[e.idx];
		}
		long pattern = fact[(int)size - 1];
		for(Edge e : vs[cur].adj){
			if(e.dst == parent){
				continue;
			}
			int s = (int) memoSize[e.idx];
			pattern = (pattern * invfact[s]) % MOD;
			pattern = (pattern * memo[e.idx]) % MOD;
		}
		long ret[] = {size, pattern};
		return ret;
	}
	static long[] fact;
	static long[] invfact;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		fact = new long[N + 1];
		invfact = new long[N + 1];

		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length ; ++i){
			fact[i] = ((long)(i) * fact[i - 1]) % MOD;
		}
		for(int i = 0 ; i < fact.length ; ++i){
			invfact[i] = modinv(fact[i]);
		}
		Vertex vs[] = new Vertex[N];
		for(int i = 0 ; i < N ; ++i){
			vs[i] = new Vertex();
		}
		int E = N - 1;
		for(int i = 0 ; i< N -1 ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			Edge e0 = new Edge(a, b, 2 * i);
			Edge e1 = new Edge(b, a, 2 * i + 1);
			vs[a].adj.add(e0);
			vs[b].adj.add(e1);		
		}
		long memo[] = new long[E * 2];
		Arrays.fill(memo, -1);
		long memoSize[] = new long[E * 2];
		Arrays.fill(memoSize, -1);
		List<Integer> visitOrder = new ArrayList<Integer>();
		rec(0 , vs , memo , memoSize , 0 , visitOrder);
		for(int i = 0 ; i < N ; ++i){
			int cur = visitOrder.get(i);
			long patMul = 1;
			for(Edge e : vs[cur].adj){
				int size = (int)memoSize[e.idx];
				patMul = (patMul * memo[e.idx]) % MOD;
				patMul = (patMul * invfact[size]) % MOD;
			}
			for(Edge e : vs[cur].adj){
				int redge = e.idx % 2 == 0 ? e.idx + 1 : e.idx - 1;
				int size = (int) memoSize[e.idx];
				int rsize = N - size;
				long p = fact[rsize - 1];
				p = (p * patMul) % MOD;
				p = (p * fact[size]) % MOD;
				p = (p * modinv(memo[e.idx])) % MOD;
				memoSize[redge] = rsize;
				memo[redge] = p;
			}
		}
		for(int i = 0 ; i < N ; ++i){
			Vertex v = vs[i];
			int S = (int) N - 1;
			long pattern = fact[S];
			for(Edge e : v.adj){
				int s = (int) memoSize[e.idx];
				pattern = (pattern * invfact[s]) % MOD;
				pattern = (pattern * memo[e.idx]) % MOD;
			}
			System.out.println(pattern);
		}
	}
}
