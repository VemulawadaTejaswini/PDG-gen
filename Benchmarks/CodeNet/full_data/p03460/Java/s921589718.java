import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in))) {
			String[] input = reader.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			int[] X = new int[N];
			int[] Y = new int[N];
			boolean[] C = new boolean[N];
			int maxX = 0;
			int maxY = 0;
			for (int i = 0; i < N; i++) {
				input = reader.readLine().split(" ");
				X[i] = Integer.parseInt(input[0]);
				maxX = maxX < X[i] ? X[i] : maxX;
				Y[i] = Integer.parseInt(input[1]);
				maxY = maxY < Y[i] ? Y[i] : maxY;
				C[i] = "W".equals(input[2]) ? false : true;
			}
			maxX++;
			maxY++;

			boolean[][] check = new boolean[maxX + K * 2][maxY + K * 2];
			for (int i = 0; i < maxX + K * 2; i++) {
				for (int j = 0; j < maxY + K * 2; j++) {
					check[i][j] = i % (2 * K) < K && j % (2 * K) < K
							|| i % (2 * K) >= K && j % (2 * K) >= K;
				}
			}

			int max = 0;
			for (int i = 0; i < K * 2; i++) {
				for (int j = 0; j < K * 2; j++) {
					int count = 0;
					for (int n = 0; n < N; n++) {
						if (getColor(K, i, j, X[n], Y[n]) == C[n]) {
							count++;
						}
					}
					max = max < count ? count : max;
				}
			}
			System.out.println(max);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean getColor(int K, int stX, int stY, int x, int y) {
		return (x + stX) % (2 * K) < K && (y + stY) % (2 * K) < K
				|| (x + stX) % (2 * K) >= K && (y + stY) % (2 * K) >= K;
	}
}
