import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[][] xya = new int[N][3];
		for (int i = 0; i < N; i++) {
			int[] temp = new int[3];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			temp[2] = sc.nextInt();
			xya[i] = temp;
		}
		int[][] M = new int[H][W];
		for (int i = 0; i < N; i++) {
			if (xya[i][2] == 1) {
				for (int y = 0; y < H; y++) {
					for (int x = 0; x < xya[i][0]; x++) {
						M[y][x] = 1;
					}
				}
			} else if (xya[i][2] == 2) {
				for (int y = 0; y < H; y++) {
					for (int x = xya[i][0]; x < W; x++) {
						M[y][x] = 1;
					}
				}
			} else if (xya[i][2] == 3) {
				for (int y = H - 1; y > H - 1 - xya[i][1]; y--) {
					for (int x = 0; x < W; x++) {
						M[y][x] = 1;
					}
				}
			} else if (xya[i][2] == 4) {
				for (int y = 0; y < H - xya[i][1]; y++) {
					for (int x = 0; x < W; x++) {
						M[y][x] = 1;
					}
				}
			}
		}
		int ret = 0;
		System.out.println(W * H - ret);
	}
}