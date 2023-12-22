import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int X = scan.nextInt() - 1;
		int Y = scan.nextInt() - 1;
		int[][] distance = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				distance[i][j] = j-i;
			}
		}

		for (int x = 0; x < Y; x++) {
			for (int y = X+1; y < N; y++) {
				if (distance[x][y] > Math.abs(X-x) + Math.abs(Y-y) + 1) {
					distance[x][y] = Math.abs(X-x) + Math.abs(Y-y) + 1;
				}
			}
		}

		int[] ans = new int[N];

		for (int x = 0; x < N; x++) {
			for (int y = x+1; y < N; y++) {
				ans[distance[x][y]]++;
			}
		}

		for (int i = 1; i < N; i++) {
			System.out.println(ans[i]);
		}

	}

}