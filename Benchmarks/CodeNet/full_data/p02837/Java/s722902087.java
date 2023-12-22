import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int permu[][];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		permu = new int[(int) Math.pow(2, n)][n];

		int said[][] = new int[n][n];

		for (int i = 0; i < n; i++)
			Arrays.fill(said[i], -1);

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			for (int j = 0; j < a; j++) {
				String str[] = br.readLine().split(" ");
				int x = Integer.parseInt(str[0]) - 1;
				int y = Integer.parseInt(str[1]);
				said[i][x] = y;
			}
		}

		for (int i = 0; i < Math.pow(2, n); i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					permu[i][j] = 1;
				} else {
					permu[i][j] = 0;
				}
				// System.out.print(permu[i][j]);
			}
			// System.out.print("\n");
		}

		int max = 0;

		for (int i = 0; i < Math.pow(2, n); i++) {
			int ans = 0;
			boolean flag = false;

			for (int j = 0; j < n; j++) {
				if (permu[i][j] == 1) {
					for (int k = 0; k < n; k++) {
						if (said[j][k] == 0) {
							if (permu[i][k] != 0) {
								flag = true;
								break;
							}
						} else if (said[j][k] == 1) {
							if (permu[i][k] != 1) {
								flag = true;
								break;
							}
						}
					}
					ans++;
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				continue;
			}
			max = Math.max(max, ans);
		}
		System.out.println(max);
	}

}