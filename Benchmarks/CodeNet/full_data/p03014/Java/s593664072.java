import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();int W = sc.nextInt();
		int[][] l = new int[H][W]; int[][] r = new int[H][W];
		int[][] u = new int[H][W]; int[][] d = new int[H][W];
		String[][] map = new String[H][W]; int max = 0;

		for(int i = 0; i < H; i++)
			map[i] = sc.next().split("");

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(map[i][j].equals("#")) {
					l[i][j] = 0;
				}else {
					if(j == 0) {
						l[i][j] = 1;
					}else {
						l[i][j] = l[i][j-1] + 1;
					}
				}
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = W-1; j >= 0; j--) {
				if(map[i][j].equals("#")) {
					r[i][j] = 0;
				}else {
					if(j == W-1) {
						r[i][j] = 1;
					}else {
						r[i][j] = r[i][j+1] + 1;
					}
				}
			}
		}
		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				if(map[j][i].equals("#")) {
					u[j][i] = 0;
				}else {
					if(j == 0) {
						u[j][i] = 1;
					}else {
						u[j][i] = u[j-1][i] + 1;
					}
				}
			}
		}
		for(int i = 0; i < W; i++) {
			for(int j = H-1; j >= 0; j--) {
				if(map[j][i].equals("#")) {
					d[j][i] = 0;
				}else {
					if(j == H-1) {
						d[j][i] = 1;
					}else {
						d[j][i] = d[j+1][i] + 1;
					}
				}
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int a = l[i][j] + r[i][j] + u[i][j] + d[i][j] - 3;
				max = Math.max(a, max);
			}
		}

		System.out.println(max);
	}
}