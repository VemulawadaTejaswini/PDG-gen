import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class UnionFind {

	int[] par;

	public UnionFind(int size) {
		par = new int[size];
		Arrays.fill(par, -1);
	}

	public int root(int x) {
		if (par[x] < 0) {
			return x;
		}
		int z = root(par[x]);
		par[x] = z;
		return z;
	}

	public boolean same(int a, int b) {
		return root(a) == root(b);
	}

	public void unite(int a, int b) {
		if (!same(a, b)) {
			int ra = root(a);
			int rb = root(b);

			if (par[ra] < par[rb]) {
				par[ra] += par[rb];
				par[rb] = ra;
			} else {
				par[rb] += par[ra];
				par[ra] = rb;
			}
		}
	}

	public int size(int a) {
		return -par[root(a)];
	}

}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<int[]> hen = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			hen.add(new int[] { sc.nextInt() - 1, sc.nextInt() - 1 }); //0オリジンにしとく
		}

		sc.close();

		int ans = 0;
		for (int i = 0; i < M; i++) {
			UnionFind uf = new UnionFind(N);
			for (int j = 0; j < M; j++) {
				//i以外の辺を追加
				if (i == j) {
					continue;
				}
				uf.unite(hen.get(j)[0], hen.get(j)[1]);
			}

			if (uf.size(0) != N) {
				//iは橋
				ans++;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
