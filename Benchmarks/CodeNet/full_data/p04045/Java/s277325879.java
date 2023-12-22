import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] D = nextIntArray(sc, K);

		sc.close();
		Set<Integer> deny = new HashSet<>();
		Set<Integer> allow = new HashSet<>();
		for (int i = 0; i < D.length; i++) {
			deny.add(D[i]);
		}
		for (int i = 0; i <= 9; i++) {
			if (!deny.contains(i)) {
				allow.add(i);
			}
		}
		int ans = 0;
		for (int i = N; i <= 100000; i++) {
			Set<Integer> u = new HashSet<>();
			String s = String.valueOf(i);
			for (char c : s.toCharArray()) {
				u.add(c - '0');
			}
			if (allow.containsAll(u)) {
				ans = i;
				break;
			}
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
}
