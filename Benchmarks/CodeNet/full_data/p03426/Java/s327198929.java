import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int[][] a = new int[h][w];
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		long[][] gragh = new long[9000][9000];
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0 ; i < q ; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				for(int k = 0 ; k < h ; k++) {
					for(int m = 0 ; m < w ; m++) {
						int x = a[i][j];
						int y = a[k][m];
						int dis = Math.abs(k - i) + Math.abs(m - j);
						gragh[x][y] = dis;
					}
				}
			}
		}
		for(int i = 0 ; i < q ; i++) {
			long ans = 0;
			if(l[i] == r[i]) {
				System.out.println(0);
				continue;
			}
			for(int j = l[i] ; j + d <= r[i] ; j += d) {
				ans += gragh[j][j + d];
			}
			System.out.println(ans);
		}
	}
}
