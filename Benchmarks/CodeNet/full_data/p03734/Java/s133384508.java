import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long ww = sc.nextLong();
			long[] w = new long[n];
			long[] v = new long[n];
			List<Long>[] vs = new ArrayList[4];
			for (int i = 0; i < 4; i++) {
				vs[i] = new ArrayList<Long>();
			}

			for (int i = 0; i < n; i++) {
				w[i] = sc.nextLong();
				v[i] = sc.nextLong();
				vs[(int) (w[i] - w[0])].add(v[i]);
			}

			for (int i = 0; i < 4; i++) {
				Collections.sort(vs[i]);
			}

			long[][] vSum = new long[4][n + 1];
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= vs[i].size(); j++) {
					vSum[i][j] = vSum[i][j - 1] + vs[i].get(j - 1);
				}
			}

			long max = 0;
			for (int a = 0; a <= vs[0].size(); a++) {
				for (int b = 0; b <= vs[1].size(); b++) {
					for (int c = 0; c <= vs[2].size(); c++) {
						for (int d = 0; d <= vs[3].size(); d++) {
							long nSum = w[0] * a + (w[0] + 1) * b + (w[0] + 2) * c + (w[0] + 3) * d;
							if (nSum > ww) {
								continue;
							}

							max = Math.max(max, vSum[0][a] + vSum[1][b] + vSum[2][c] + vSum[3][d]);
						}
					}
				}
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
