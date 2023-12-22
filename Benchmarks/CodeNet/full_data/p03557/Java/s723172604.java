import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] parts = new int[3][n];
		for (int i = 0; i < 3; i++) {
			String[] input = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				parts[i][j] = Integer.parseInt(input[j]);
			}
			Arrays.sort(parts[i]);

		}
		int[][] pn = new int[3][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= n)
					break;
				if (parts[0][j] >= parts[1][i]) {
					pn[0][i] = j;
					i++;
					j--;
					continue;
				}

			}
			if (i >= n)
				break;
			pn[0][i] = n;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= n)
					break;
				if (parts[1][j] >= parts[2][i]) {
					pn[1][i] = j;
					i++;
					continue;
				}

			}
			if (i >= n)
				break;
			pn[1][i] = n;
		}
		pn[2][0] = pn[0][0];
		for (int i = 1; i < n; i++) {
			pn[2][i] = pn[0][i] + pn[2][i - 1];
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			if (pn[1][i] == 0)
				continue;
			total += pn[2][pn[1][i] - 1];
		}
		System.out.println(total);
	}
}
