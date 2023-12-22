import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int dp[][];
	static int dpT[][][];
	static boolean done[][];
	static boolean doneT[][][];

	static int L[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		L = new int[n];
		for (int i = 0; i < n; i++) {
			L[i] = Integer.parseInt(str[i]);
		}

		dp = new int[n][n];
		done = new boolean[n][n];
		dpT = new int[n][n][n];
		doneT = new boolean[n][n][n];

		int ans = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (isTriangle(i, j, k))
						ans++;
				}
			}
		}
		System.out.println(ans);
	}

	static boolean isTriangle(int a, int b, int c) {
		int sum1, sum2, sum3;

		if (doneT[a][b][c] || doneT[a][c][b] || doneT[b][a][c] || doneT[b][c][a] || doneT[c][a][b] || doneT[c][b][a]) {
			return doneT[a][b][c];
		}

		if (done[a][b]) {
			sum1 = dp[a][b];
		} else {
			sum1 = L[a] + L[b];
			dp[a][b] = sum1;
			done[a][b] = true;
		}
		if (done[a][c]) {
			sum2 = dp[a][c];
		} else {
			sum2 = L[a] + L[c];
			dp[a][c] = sum2;
			done[a][c] = true;
		}
		if (done[b][c]) {
			sum3 = dp[b][c];
		} else {
			sum3 = L[c] + L[b];
			dp[b][c] = sum3;
			done[b][c] = true;
		}

		if (sum1 > L[c] && sum2 > L[b] && sum3 > L[a]) {
			doneT[a][b][c] = true;
			doneT[a][c][b] = true;
			doneT[b][a][c] = true;
			doneT[b][c][a] = true;
			doneT[c][a][b] = true;
			doneT[c][b][a] = true;
			return true;
		}
		doneT[a][b][c] = false;
		doneT[a][c][b] = false;
		doneT[b][a][c] = false;
		doneT[b][c][a] = false;
		doneT[c][a][b] = false;
		doneT[c][b][a] = false;
		return false;
	}
}