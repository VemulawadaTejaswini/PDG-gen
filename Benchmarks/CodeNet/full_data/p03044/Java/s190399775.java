import java.io.InputStream;
import java.io.PrintStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
	public Pair(K key, V value) {
		super(key, value);
	}
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	List<List<Pair<Integer, Integer>>> g;
	int[] c;

	private void rec(int n, int z) {
		if (c[n] != -1)
			return;
		c[n] = z;
		for (Pair<Integer, Integer> p : g.get(n)) {
			if (p.getValue() % 2 == 0) {
				rec(p.getKey(), z);
			} else {
				rec(p.getKey(), z ^ 1);
			}
		}
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		g = new ArrayList<>(N + 1);

		for (int i = 0; i <= N; i++) {
			g.add(new ArrayList<>());
		}

		for (int i = 1; i < N; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();

			g.get(u).add(new Pair<>(v, w));
			g.get(v).add(new Pair<>(u, w));
		}

		c = new int[N + 1];
		Arrays.fill(c, -1);

		rec(1, 0);

		for (int i = 1; i <= N; i++) {
			out.println(c[i]);
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
