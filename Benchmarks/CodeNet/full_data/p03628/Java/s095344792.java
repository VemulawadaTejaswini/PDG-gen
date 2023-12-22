import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String matrix[][] = new String[2][n];

		for (int i = 0; i < 2; i++) {
			String str[] = br.readLine().split("");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = str[j];
			}
		}

		int prev = -1;
		int ans = 1;

		for (int i = 0; i < n; i++) {
			if (matrix[0][i].equals(matrix[1][i])) {
				if (prev == 1) {
					ans *= 2;
				} else if (prev == 2) {
					ans *= 1;
				} else {
					ans *= 3;
				}
				prev = 1;
			} else {
				if (prev == 1) {
					ans *= 2;
				} else if (prev == 2) {
					ans *= 3;
				} else {
					ans *= 6;
				}
				prev = 2;
				i++;
			}
			ans %= 1000000007;
		}
		System.out.println(ans);
	}
}