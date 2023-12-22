import java.util.Scanner;

public class Main {
	public static int mod = 7 + (int) Math.pow(10, 9);
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] line = s.nextLine().split(" ");
		int rows = Integer.parseInt(line[0]);
		int cols = Integer.parseInt(line[1]);

		long[][] matrix = new long[rows][cols];
		for(int i = 0; i < rows; i++) {
			line = s.nextLine().split("");
			for(int j = 0; j < cols; j++) {
				if(line[j].equals(".")) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = Long.MAX_VALUE;
				}
			}
		}
		PartialFloodFill(matrix, 0, 0);
		System.out.println(matrix[rows-1][cols-1]);
	}

	public static void PartialFloodFill(long[][] matrix, int i, int j){
		long current = matrix[i][j];
		if (current == Long.MAX_VALUE) {
			return;
		}
		matrix[i][j]++;
		matrix[i][j] = (current+1) % mod;
		if(i == matrix.length && j == matrix[i].length) {
			return;
		}

		if (i < matrix.length - 1) { //Has right tiles
			PartialFloodFill(matrix, i + 1, j);
		}
		if (j < matrix[i].length - 1) { //Has down tiles
			PartialFloodFill(matrix, i, j + 1);
		}
	}
}
