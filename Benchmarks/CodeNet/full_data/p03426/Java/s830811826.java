import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(),w = sc.nextInt(), d = sc.nextInt();
		int[][] arr = new int[h][w];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int q = sc.nextInt();
		long[][] p = new long[h*w+1][h*w+1];//a to b の移動距離
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				for(int ii = 0; ii < h; ii++) {
					for(int jj = 0; jj < w; jj++) {
						p[arr[i][j]][arr[ii][jj]] = p[arr[ii][jj]][arr[i][j]] = Math.abs(ii - i) + Math.abs(jj - j);
					}
				}
			}
		}
		for(int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			long syo = 0L;
			while(l != r) {
				syo += p[l][l+d];
				l+=d;
			}
			System.out.println(syo);
		}
	}
}