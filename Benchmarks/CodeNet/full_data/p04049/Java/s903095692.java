import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int n, k;
	List<Integer>[] e;
	boolean[] del;

	void depth(int i, boolean[] f, int[] depth, int d) {
		if (f[i] || del[i]) {
			return;
		}
		f[i] = true;
		depth[i] = d;
		for (Integer to : e[i]) {
			depth(to, f, depth, d + 1);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		k = sc.nextInt();
		e = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a].add(b);
			e[b].add(a);
		}

		int count = 0;
		del = new boolean[n];
		boolean f = true;
		while (f) {
			f = false;
			int[] depth = new int[n];
			for (int i = 0;; i++) {
				if (!del[i]) {
					depth(0, new boolean[n], depth, 0);
					break;
				}
			}
			int root = 0;
			for (int i = 0; i < n; i++) {
				if (!del[i] && depth[root] < depth[i]) {
					root = i;
				}
			}
			depth(root, new boolean[n], depth, 0);
			for (int i = 0; i < n; i++) {
				if (!del[i] && k < depth[i]) {
					count++;
					f = true;
					del[i] = true;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
