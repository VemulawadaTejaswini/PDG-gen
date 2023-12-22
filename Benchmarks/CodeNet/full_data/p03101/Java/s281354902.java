import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int cnt = 0;
 
		int[][] a = new int[H][W];
 
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				a[i][j] = 1;
			}
		}
 
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < W; j++) {
				a[i][j] = 0;
			}
		}
 
		for (int j = 0; j < w; j++) {
			for (int i = 0; i < H; i++) {
				a[i][j] = 0;
			}
		}
 
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (a[i][j] == 1) {
					cnt++;
				}
			}
		}
 
		System.out.println(cnt);
 
	}
}