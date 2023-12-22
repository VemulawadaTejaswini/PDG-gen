import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray1origin(sc, N);

		sc.close();

		ArrayList<int[]> a = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			a.add(new int[] { i, A[i] });
		}

		Collections.sort(a, (x, y) -> Integer.compare(x[1], y[1]));

		StringBuilder sb = new StringBuilder();
		for (int[] z : a) {
			sb.append(z[0]);
			sb.append(" ");
		}

		out.println(sb.toString().trim());

	}

	public static void main(String[] args) {
		new Main()._main(args);
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
