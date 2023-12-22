import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[][] ab = new int[N][2];
		int[][] cd = new int[N][2];

		for (int i = 0; i < N; i++) {
			ab[i] = new int[] { sc.nextInt(), sc.nextInt() };
		}
		for (int i = 0; i < N; i++) {
			cd[i] = new int[] { sc.nextInt(), sc.nextInt() };
		}

		sc.close();

		// abの各要素について、仲良しペアの候補を列挙（N^2)

		List<List<int[]>> nakayoshi = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			List<int[]> a = new ArrayList<>();
			for (int j = 0; j < N; j++) {
				if (ab[i][0] < cd[j][0] && ab[i][1] < cd[j][1]) {
					a.add(cd[j]);
				}
			}
			nakayoshi.add(a);
		}

		// 要素ごとの仲良しペアの個数で昇順でソート
		nakayoshi.sort((a, b) -> Integer.compare(a.size(), b.size()));

		// 個数の小さいものから順番に決定してく
		boolean[][] picked = new boolean[2 * N][2 * N];

		int ans = 0;

		for (List<int[]> x : nakayoshi) {

			for (int[] z : x) {
				if (!picked[z[0]][z[1]]) {
					picked[z[0]][z[1]] = true;
					ans++;
					break;
				}
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

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
