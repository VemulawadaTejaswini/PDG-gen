import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		long[] p = nextLongArray(sc, A);
		long[] q = nextLongArray(sc, B);
		long[] r = nextLongArray(sc, C);

		sc.close();

		Arrays.sort(p);
		Arrays.sort(q);
//		Arrays.sort(r);

		List<Long> ans = new ArrayList<>();
		for (int i = 0; i < X; i++) {
			ans.add(p[A - i - 1]);
		}
		for (int i = 0; i < Y; i++) {
			ans.add(q[B - i - 1]);
		}

		for (int i = 0; i < C; i++) {
			ans.add(r[i]);
		}

		ans.sort(Comparator.reverseOrder());

		long z = 0;
		for (int i = 0; i < X + Y; i++) {
			z += ans.get(i);
		}

		out.println(z);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}
}
