import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] x = new int[n][2];

		for (int i = 0; i < n; i++) {
			x[i][0] = sc.nextInt();
			x[i][1] = sc.nextInt();
		}

		Arrays.sort(x, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}

		});

		BigDecimal ans = new BigDecimal(0);
		int y = 0;

		for (int i = 0; y < m; i++) {
			BigDecimal a = new BigDecimal(x[i][0]);

			// a * min(x[i][1], m-y)
			a = a.multiply(new BigDecimal(Math.min(x[i][1], m - y)));
			ans = ans.add(a);

			y += x[i][1];

		}
		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
