import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int dRow = sc.nextInt();
		int dColumn = sc.nextInt();

		int[][] matrix = new int[row][column];
		matrix[0][0] = 1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(i==0 && j==0) continue;
				else if(i>=row-dRow && j<dColumn) matrix[i][j] = 0;
				else if(i==0) matrix[i][j] = matrix[i][j-1];
				else if(j==0) matrix[i][j] = matrix[i-1][j];
				else matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
			}
		}
		System.out.println(matrix[row-1][column-1]);
	}
}