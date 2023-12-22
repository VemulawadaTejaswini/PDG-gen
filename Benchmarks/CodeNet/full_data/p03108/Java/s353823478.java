import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[M];
		int B[] = new int[M];
		UnionFind.init(N);
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}
		int ans[] = new int[M];
		int temp = 0;
		for(int i = 1; i < N; i++) {
			temp += i;
		}
		
		Arrays.fill(ans, temp);
		ArrayList<Integer> ary = new ArrayList<Integer>();
		for(int i = M - 1; i > 0; i--) {
			UnionFind.unite(A[i], B[i]);
			boolean flag = true;
			for(int j = ary.size() - 1; j >= 0; j--) {
				if(UnionFind.same(A[i], ary.get(j))) {
					flag = false;
				}
			}
			if(flag && UnionFind.getSize(A[i]) == 2) {
				ary.add(UnionFind.find(A[i]));
			}
			for(int k = 0; k < ary.size(); k++) {
				for(int j = 1; j < UnionFind.getSize(ary.get(k)); j++) {
					ans[i - 1] -= j;
				}
			}
		}
		for(int i = 0; i < M; i++) {
			if(ans[i] < 0) {
				System.out.println(0);
			} else {
				System.out.println(ans[i]);
			}
		}
	}
}

class UnionFind {
	static int N;
	static int par[];
	static int rank[];
	static int size[];
	public static void init(int n) {
		N = n;
		par = new int[N];
		rank = new int[N];
		size = new int[N];
		for(int i = 0; i < N; i++) {
			par[i] = i;
			rank[i] = 0;
			size[i] = 1;
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
			size[y] += size[x];
		} else {
			par[y] = x;
			size[x] += size[y];
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
	
	public static int getSize(int x) {
		int rootX = find(x);
		return size[rootX];
	}
	
	public static boolean same(int x, int y) {
		return find(x) == find(y);
	}
}
