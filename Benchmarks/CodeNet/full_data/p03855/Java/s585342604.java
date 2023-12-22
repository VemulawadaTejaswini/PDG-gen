import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int L = sc.nextInt();
		int p[][] = new int[K][2];
		int r[][] = new int[L][2];
		UnionFind uni1 = new UnionFind();
		UnionFind uni2 = new UnionFind();
		uni1.init(N);
		uni2.init(N);
		boolean f1[] = new boolean[N];
		Arrays.fill(f1, false);
		for(int i = 0; i < K; i++) {
			p[i][0] = sc.nextInt() - 1;
			p[i][1] = sc.nextInt() - 1;
			f1[p[i][0]] = true;
			f1[p[i][1]] = true;
			uni1.unite(p[i][0], p[i][1]);
		}
		boolean f2[] = new boolean[N];
		Arrays.fill(f2, false);
		for(int i = 0; i < L; i++) {
			r[i][0] = sc.nextInt() - 1;
			r[i][1] = sc.nextInt() - 1;
			f2[r[i][0]] = true;
			f2[r[i][1]] = true;
			uni2.unite(r[i][0], r[i][1]);
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			if(f1[i] && f2[i]) {
				System.out.print("2 ");
			} else if(f1[i] || f2[i]) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
}

class UnionFind {
	static int N;
	static int par[];
	static int rank[];
	public static void init(int n) {
		N = n;
		par = new int[N];
		rank = new int[N];
		for(int i = 0; i < N; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}
	
	public static int find(int x) {
		if(par[x] == x) {
			return x;
		} else {
			return par[x] = find(par[x]);
		}
	}
	
	public static void unite(int x, int y) {
		x = find(x);
		y = find(y);
		if(x == y) return;
		
		if(rank[x] < rank[y]) {
			par[x] = y;
		} else {
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
	
	public static boolean same(int x, int y) {
		return find(x) == find(y);
	}
}
