public class Main {
	public static void main(String[] args) {
		int r = 0;
		int c = 0;
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		c = scan.nextInt();
		int[][] matrix = new int[r + 1][c + 1];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int matNum = scan.nextInt();
				matrix[i][j] = matNum;
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
				matrix[i][c] += matrix[i][j];
				matrix[r][j] += matrix[i][j];
				matrix[r][c] += matrix[i][j];
			}
			System.out.print(matrix[i][c]);
			System.out.println();
		}
		for (int j = 0; j < c + 1; j++) {
			System.out.print(matrix[r][j]);
			if (j == c) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println();
		scan.close();
	}
}
