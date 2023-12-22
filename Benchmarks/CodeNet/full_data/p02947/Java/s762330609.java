import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		List<String> s = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			s.add(sc.next());
		}

		sc.close();

		List<String> s2 = new ArrayList<>();
		for (String x : s) {
			char[] c = x.toCharArray();
			Arrays.sort(c);
			s2.add(new String(c));
		}

		s2.sort(Comparator.naturalOrder());

		long ans = 0;
		Map<String, Long> m = s2.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));

		for (Long n : m.values()) {
			ans += f(n);
		}

		out.println(ans);

	}

	private long f(long x) {
		long ans = 0;
		for (int i = 0; i <= x - 1; i++) {
			ans += i;
		}
		return ans;
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
