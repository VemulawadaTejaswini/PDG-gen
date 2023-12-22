import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
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
		int K = sc.nextInt();

		UnionFind u = new UnionFind(N);

		int[] numOfFriend = new int[N];

		for (int i = 0; i < M; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			u.unite(A, B);

			numOfFriend[A]++;
			numOfFriend[B]++;

		}

		int[] numOfBlock = new int[N];

		for (int i = 0; i < K; i++) {
			int C = sc.nextInt() - 1;
			int D = sc.nextInt() - 1;

	
		}

		sc.close();

		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < N; i++) {
			int ans = u.size(i);
			ans--; // 自分を除く
			ans -= numOfFriend[i];
			ans -= numOfBlock[i];
			buf.append(ans);
			buf.append(" ");
		}
		out.println(buf.substring(0, buf.length() - 1));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
