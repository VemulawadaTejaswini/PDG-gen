import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説どおりに作成したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt(), q = scanner.nextInt();
			int[][] x = new int[n][n], c = new int[n + 1][n + 1];
			IntStream.range(0, n).forEach(i -> Arrays.fill(x[i], 0));
			IntStream.range(0, m).forEach(i -> {
				int l = scanner.nextInt() - 1, r = scanner.nextInt() - 1;
				x[l][r]++;
			});
			Arrays.fill(c[0], 0);
			IntStream.rangeClosed(1, n).forEach(i -> c[i][0] = 0);
			IntStream.rangeClosed(1, n)
					.forEach(i -> IntStream.rangeClosed(1, n).forEach(j -> c[i][j] = c[i][j - 1] + x[i - 1][j - 1]));
			IntStream.range(0, q).forEach(i -> {
				int s = scanner.nextInt(), t = scanner.nextInt();
				System.out.println(IntStream.rangeClosed(s, t).map(j -> c[j][t] - c[j][s - 1]).sum());
			});
		}
	}
}
