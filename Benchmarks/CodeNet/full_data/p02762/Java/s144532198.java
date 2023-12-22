import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A, B;

		final int N = scanner.nextInt();

		int[] except = new int[N];

		final int M = scanner.nextInt();

		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			union(A, B);
			except[A]++;
			except[B]++;
		}

		final int K = scanner.nextInt();
		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			if (find(A) == find(B)) {
				except[A]++;
				except[B]++;
			}
		}

		scanner.close();
		for (int i = 0; i < N; i++) {
			System.out.print(desc[find(i)] - except[i]);
			System.out.print(i == N - 1 ? "\n" : " ");
		}
	}

	static int[] parent;
	static int[] desc;

	static void prepare(int n) {
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = n;
		}
		desc = new int[n];
	}

	static int find(int x) {
		if (parent[x] == x)
			return x;
		else
			return find(parent[x]);
	}

	static void union(int x, int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if (desc[xRoot] >= desc[yRoot]) {
			parent[yRoot] = xRoot;
			desc[xRoot] += desc[yRoot] + 1;
		} else {
			parent[xRoot] = yRoot;
			desc[yRoot] += desc[xRoot] + 1;
		}
	}
}
