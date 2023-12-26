public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		long[][] c = new long[n][l];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		long temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m; k++) {
					temp += a[i][k] * b[k][j];
				}
				c[i][j] = temp;
				temp = 0;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				if(j == 0) System.out.print(c[i][j]);
				else System.out.print(" " + c[i][j]);
			}
			System.out.println();
		}
	}
}
