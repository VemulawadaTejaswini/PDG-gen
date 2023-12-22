import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);
		sc.close();

		HashMap<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int v = 0;
			if (m.containsKey(A[i])) {
				v = m.get(A[i]);
			}
			v++;
			m.put(A[i], v);
		}

		List<int[]> l = m.entrySet().stream()
				.filter(i -> (i.getValue() >= 2))
				.sorted((e1, e2) -> Integer.compare(e2.getKey(), e1.getKey()))
				.map(e -> new int[] { e.getKey(), e.getValue() })
				.collect(Collectors.toList());

		long ans;

		if (l.size() == 0) {
			ans = 0;
		} else if (l.get(0)[1] >= 4) {
			ans = (long)l.get(0)[0] * l.get(0)[0];
		} else if (l.size() == 1) {
			ans = 0;
		} else {
			ans = (long)l.get(0)[0] * l.get(1)[0];
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

}
