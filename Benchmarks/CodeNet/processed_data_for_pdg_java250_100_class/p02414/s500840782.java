public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		int line_column = in.nextInt();
		int column = in.nextInt();
		int[][] matrixA = new int[line][line_column];
		int[][] matrixB = new int[line_column][column];
		for(int i = 0; i < line; i++){
			for(int j = 0; j < line_column; j++){
				matrixA[i][j] = in.nextInt();
			}
		}
		for(int j = 0; j < line_column; j++){
			for(int k = 0; k < column; k++){
				matrixB[j][k] = in.nextInt();
			}
		}
		long[][] ans = new long[line][column];
		for(int i = 0; i < line; i++){
			for(int j = 0; j < line_column; j++){
				for(int k = 0; k < column; k++){
					ans[i][k] += matrixA[i][j] * matrixB[j][k];
				}
			}
		}
		for(int i = 0; i < line; i++){
			for(int k = 0; k < column - 1; k++){
				System.out.print(ans[i][k] + " ");
			}
			System.out.println(ans[i][column - 1]);
		}
	}
}
