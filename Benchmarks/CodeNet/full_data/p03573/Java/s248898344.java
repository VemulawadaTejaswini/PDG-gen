import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] field = new String[h + 2][w + 2];
		for (int i = 0; i < h; i++) {
			String[] line = sc.next().split("");
			for (int j = 0; j < w; j++) {
				field[i + 1][j + 1] = line[j];
			}
		}
		sc.close();

		for (int i = 0; i < h + 2; i++) {
			for (int j = 0 ; j < w + 2; j++) {
				if (i == 0 || i == h + 1 || j == 0 || j == w + 1) {
					field[i][j] = ".";
				}
			}
		}

		for (int i = 0; i < h + 2; i++) {
			for (int j = 0; j < w + 2; j++) {
				if (i == 0 || i == h + 1) {
					continue;
				} else if (j == 0 || j == w + 1) {
					continue;
				} else if (field[i][j].equals("#")) {
					System.out.print("#");
				} else {
					int count = 0;
					for (int row = i - 1; row <= i + 1; row++) {
						for (int col = j - 1; col <= j + 1; col++) {
							if (field[row][col].equals("#")) {
								count++;
							}
						}
					}
					System.out.print(String.valueOf(count));
				}
			}
			if (i != 0 && i != h + 1) System.out.println();
		}
	}
}