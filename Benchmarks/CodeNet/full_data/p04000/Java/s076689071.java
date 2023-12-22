import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();

		int x;
		int y;
		int grid[][] = new int[2][N];
		for (int i = 0; i < N; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			grid[0][i] = x;
			grid[1][i] = y;
		}

		int count[] = new int[10];
		for (int i = 0; i < (H - 2); i++) {
			for (int j = 0; j < (W - 2); j++) {

				int count33 = 0;
				for (int k = 0; k < N; k++) {
					if (grid[0][k] >i&grid[0][k] <= 3 + i) {
						if (grid[1][k] >j&grid[1][k] <= 3 + j) {
							count33++;
						}
					}

				}
				count[count33]++;
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}

	}
}