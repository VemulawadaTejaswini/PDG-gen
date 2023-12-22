import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int[][] magic = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				magic[i][j] = sc.nextInt();
			}
		}

		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (magic[i][j] > magic[i][k] + magic[k][j]) {
						magic[i][j] = magic[i][k] + magic[k][j];
					}
				}
			}
		}

		int[][] targets = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				targets[i][j] = sc.nextInt();
			}
		}

		int cost = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (targets[i][j] == -1 || targets[i][j] == 1) {
					continue;
				} else {
					cost += magic[targets[i][j]][1];
				}
			}
		}
		System.out.println(cost);
	}
}