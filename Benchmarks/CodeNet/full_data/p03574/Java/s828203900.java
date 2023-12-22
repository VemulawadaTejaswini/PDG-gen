import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] input = new int[H][W];
		for (int i = 0; i < H; i++) {
			String[] inputs = sc.next().split("");
			for (int j = 0; j < W; j++) {
				if (inputs[j].equals("#")) {
					input[i][j] = 1;
				} else {
					input[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (input[i][j] == 1) {
					System.out.print("#");
				} else {
					int output = 0;
					if (i - 1 >= 0) {
						for (int k = 0; k < 3; k++) {
							if (j + k - 1 < 0 || j + k - 1 >= W) {
								continue;
							}
							if (input[i - 1][j + k - 1] == 1) {
								output++;
							}
						}
					}
					for (int k = 0; k < 3; k++) {
						if (j + k - 1 < 0 || j + k - 1 >= W) {
							continue;
						}
						if (input[i][j + k - 1] == 1) {
							output++;
						}
					}
					if (i + 1 < H) {
						for (int k = 0; k < 3; k++) {
							if (j + k - 1 < 0 || j + k - 1 >= W) {
								continue;
							}
							if (input[i + 1][j + k - 1] == 1) {
								output++;
							}
						}
					}
					System.out.print(output);
				}
			}
			System.out.println();
		}
	}
}
