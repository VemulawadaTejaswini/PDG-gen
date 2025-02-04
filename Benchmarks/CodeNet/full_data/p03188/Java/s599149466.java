import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int k = sc.nextInt();
		int n = 2 * ((k+3)/4);
		int curt = n*2 - k;
		int[][] mat = new int[n][n];
		for(int r=0; r<n; r++) {
			for(int c=0; c<n;c++) {
				if(r%2 == 1 && (r+c)%n >=curt) {
					mat[r][c] = n + (r+c)%n;
				} else {
					mat[r][c] = (r+c)%n;
				}
			}
		}
		for(int[] row: mat) {
			for(int x : row) {
				System.out.print(x+" ");
			}
			System.out.println("");
		}
	}
}