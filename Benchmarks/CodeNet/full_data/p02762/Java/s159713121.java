import java.util.*;

public class Main {
	public static class UnionFind {
		int[] param;
		int[] rank;
		int N;
		int xlen;
		
		public UnionFind(int n) {
			N=n;
			param = new int[N];
			rank = new int[N];
			for(int i=0; i<N; i++)
				param[i] = i;
		}
		
		public void init() {
			for(int i=0; i<N; i++)
				param[i] = i;
			Arrays.fill(rank, 0);
		}
		
		public UnionFind(int x, int y) {
			this(x*y);
			xlen=y;
		}
		
		public boolean same(int a, int b) {
			return getRoot(a)==getRoot(b);
		}
		
		public boolean same(int x1, int y1, int x2, int y2) {
			return same(x1*xlen+y1, x2*xlen+y2);
		}
		
		public int getRoot(int a) {
			if(param[a]==a) return a;
			else return (param[a] = getRoot(param[a]));
		}
		
		public void unite(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			if(a==b)
				return;
			
			if(rank[a] < rank[b]) {
				param[a] = b;
			} else {
				param[b] = a;
				if(rank[a]==rank[b])
					rank[a]++;
			}
		}
		
		public void unite(int x1, int y1, int x2, int y2) {
			unite(x1*xlen+y1, x2*xlen+y2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		HashMap<Integer, HashSet<Integer>> exclude = new HashMap<>();
		
		UnionFind uf = new UnionFind(N);
		for(int i=0; i<M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			uf.unite(A, B);
			
			HashSet<Integer> setA = exclude.get(A);
			if(setA==null) {
				setA = new HashSet<Integer>();
			}
			setA.add(B);
			exclude.put(A, setA);
			
			HashSet<Integer> setB = exclude.get(B);
			if(setB==null) {
				setB = new HashSet<Integer>();
			}
			setB.add(A);
			exclude.put(B, setB);
		}
		for(int i=0; i<K; i++) {
			int C = sc.nextInt()-1;
			int D = sc.nextInt()-1;
			if(!uf.same(C, D))
				continue;
			
			HashSet<Integer> setC = exclude.get(C);
			if(setC==null) {
				setC = new HashSet<Integer>();
			}
			setC.add(D);
			exclude.put(C, setC);
			
			HashSet<Integer> setD = exclude.get(D);
			if(setD==null) {
				setD = new HashSet<Integer>();
			}
			setD.add(C);
			exclude.put(D, setD);
		}

		int[] count = new int[N];
		for(int i=0; i<N; i++) {
			int root = uf.getRoot(i);
			count[root]++;
		}
		
		for(int i=0; i<N; i++) {
			HashSet<Integer> ex = exclude.get(i);
			int candidate = count[uf.getRoot(i)] - 1 - (ex==null ? 0 : ex.size());
			System.out.print(candidate + (i==N-1 ? "\n" : " "));
		}
		sc.close();
	}
}
