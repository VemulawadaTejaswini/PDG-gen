import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n,m;
	int[]A,B;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		A = new int[m];
		B = new int[m];
		long[] badP = new long[m];//逆順 不便度

		for(int i=0;i<m;i++) {
			A[i] = Integer.parseInt(sc.next())-1;
			B[i] = Integer.parseInt(sc.next())-1;
		}
		sc.close();

		UnionFind uf = new UnionFind(n);
		badP[m-1]=1L*n*(n-1)/2;

        for (int i = m - 1; i >= 1; i--) {
            if (uf.same(A[i], B[i])) {
                badP[i-1] = badP[i];
            } else {
                int sx = uf.size(A[i]);
                int sy = uf.size(B[i]);
                uf.union(A[i], B[i]);
                badP[i-1] = badP[i] - sx * sy;
            }
        }
		for(int i=0;i<m;i++)System.out.println(badP[i]);
	}

    class UnionFind {
        @SuppressWarnings("unused")
		private int n, t;
        private int[] parent, rank, size;

        public UnionFind(int n) {
            this.n = n;
            this.parent = new int[n];
            this.rank = new int[n];
            this.size = new int[n];
            Arrays.fill(rank, 1);
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        public void union(int x, int y) {
            t++;
            int _x = find(x);
            int _y = find(y);

            if (_x > _y) {
                parent[_y] = _x;
                size[_y] += size[_x];
                size[_x] = size[_y];
            } else if (_x < _y) {
                parent[_x] = _y;
                size[_x] += size[_y];
                size[_y] = size[_x];
            } else {
                parent[_y] = _x;
                rank[_y]++;
                size[_x] += size[_y];
                size[_y] = size[_x];
            }
        }

        public int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public int size(int x) {
            return size[find(x)];
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
    }
}
