import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[c][c];
		int[][] b = new int[n][n];
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt() - 1;
			}
		}
		long ans = Long.MAX_VALUE;
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = 0; k < c; k++) {
					if(i == j || j == k || k == i) continue;
					long sum = 0;
					for(int l = 0; l < n; l++) {
						for(int m = 0; m < n; m++) {
							// このグループはiで塗る
							if((l + m) % 3 == 0) {
								if(b[l][m] != i) sum += a[b[l][m]][i];
							// このグループはiで塗る
							} else if((l + m) % 3 == 1) {
								if(b[l][m] != j) sum += a[b[l][m]][j];
							// このグループはiで塗る
							} else {
								if(b[l][m] != k) sum += a[b[l][m]][k];
							}
						}
					}
					ans = Math.min(ans, sum);
 				}
			}
		}
		System.out.println(ans);
	}
}
