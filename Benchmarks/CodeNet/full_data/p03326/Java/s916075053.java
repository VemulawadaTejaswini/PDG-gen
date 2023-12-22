import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[n];
		long[] z = new long[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			z[i] = sc.nextLong();
		}
		long[][] sum = new long[8][n];
		for(int i = 0; i < n; i++) {
			sum[0][i] += x[i] + y[i] + z[i];
			sum[1][i] += x[i] + y[i] - z[i];
			sum[2][i] += x[i] - y[i] + z[i];
			sum[3][i] += -x[i] + y[i] + z[i];
			sum[4][i] += -x[i] - y[i] + z[i];
			sum[5][i] += -x[i] + y[i] - z[i];
			sum[6][i] += x[i] - y[i] - z[i];
			sum[7][i] += -x[i] - y[i] - z[i];
		}
		long[] result = new long[8];
		for(int i = 0; i < 8; i++) {
			Arrays.sort(sum[i]);
			for(int j = n - 1; j >= n - m; j--) result[i] += sum[i][j];
		}
		Arrays.sort(result);
		System.out.println(result[7]);
	}

	static void dfs() {

	}

}
