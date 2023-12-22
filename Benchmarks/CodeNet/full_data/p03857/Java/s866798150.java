import java.io.PrintWriter;
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
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int L = sc.nextInt();
		
		UnionFind ufRoad = new UnionFind(N);
		for(int i=0; i<K; i++) {
			ufRoad.unite(sc.nextInt()-1, sc.nextInt()-1);
		}

		UnionFind ufRail = new UnionFind(N);
		for(int i=0; i<L; i++) {
			ufRail.unite(sc.nextInt()-1, sc.nextInt()-1);
		}
		
		HashMap<Long, Integer> count = new HashMap<>();
		for(int i=0; i<N; i++) {
			long key = ((long)ufRoad.getRoot(i))<<20 | (long)ufRail.getRoot(i);
			Integer value = count.get(key);
			count.put(key, value==null ? 1 : value+1);
		}
		
		for(int i=0; i<N; i++) {
			long key = ((long)ufRoad.getRoot(i))<<20 | (long)ufRail.getRoot(i);
			pw.print(count.get(key) + (i==N-1 ? "\n" : " "));
		}
		
		sc.close();
		pw.close();
	}
}
