import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[m][m];

		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == '#') {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			String s = scanner.next();
			for (int j = 0; j < m; j++) {
				if (s.charAt(j) == '#') {
					b[i][j] = 1;
				} else {
					b[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < n - m; i++) {
			for (int j = 0; j < n - m; j++) {
				int sad = 0;

				for (int k = 0; k < m; k++) {
					for (int l = 0; l < m; l++) {
						sad += (a[i+k][j+l] - b[k][l]);
					}
				}
				if(sad==0){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}