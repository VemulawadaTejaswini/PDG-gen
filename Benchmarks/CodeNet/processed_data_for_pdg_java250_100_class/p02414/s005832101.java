public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		long[][] c = new long[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		long ans = 0;
		int i;
		int j;
		int k;
		for (i = 0; i < n; i++) {
			for (j = 0; j < l; j++) {
				for (k = 0; k < m; k++) {
					ans = ans + a[i][k] * b[k][j];
				}
				c[i][j] = ans;
				ans = 0;
			}
		}
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < l; column++) {
				System.out.print(c[row][column]);
				if (!(column == l - 1)) {
					System.out.print(" ");
				}
				if (column == l - 1) {
					System.out.println("");
				}
			}
		}
	}
}
