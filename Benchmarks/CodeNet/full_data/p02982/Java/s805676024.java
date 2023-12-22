import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] ND = br.readLine().split(" ");

		int N = Integer.parseInt(ND[0]);
		int D = Integer.parseInt(ND[1]);

		int[][] TENi = new int[N][D];

		for (int i = 0; i < N; i++) {

			String[] TEN = br.readLine().split(" ");

			for (int j = 0; j < D; j++) {
				TENi[i][j] = Integer.parseInt(TEN[j]);
			}

		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				//System.out.print(TENi[i][j] + " ");
			}
			//System.out.println();
		}

		double[][] sum = new double[N][N];

		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < D; j++) {
					sum[k][i] += Math.pow(Math.abs(TENi[k][j] - TENi[i][j]), 2);
				}
				sum[k][i] = Math.sqrt(sum[k][i]);
			}
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				if (sum[i][j] % 1 == 0 && sum[i][j] != 0) {
					//System.out.println(sum[i][j] + "は整数です");
					count++;
				}
			}
		}

		System.out.println(count / 2);
	}
}
