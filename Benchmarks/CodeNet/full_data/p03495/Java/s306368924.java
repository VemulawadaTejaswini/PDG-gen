import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] A = nextIntegerArray(sc, N);

		sc.close();

		Map<Integer, Long> m = Arrays.stream(A).collect(Collectors.groupingBy(a -> a, Collectors.counting()));

		int k = m.size();

		Long ans = m.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
				.limit(Math.max(k - K, 0))
				.map(e -> e.getValue())
				.reduce((a, b) -> a + b)
				.orElse(0L);

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private Integer[] nextIntegerArray(Scanner sc, int n) {
		Integer[] result = new Integer[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
