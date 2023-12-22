import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int res = 0;
		char[][] matrix = new char[m][n];
		
		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				String c = sc.next();
				if (c.length() > 0) {
					matrix[i][j] = c.charAt(0);
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == '.') {
					int area = 1;
					int r = i;
					int c = j;
					
					r = i - 1;
					while (r >= 0 && matrix[r][j] == '.') {
						area++;
						r--;
					}
					
					r = i + 1;
					while (r < m && matrix[r][j] == '.') {
						area++;
						r++;
					}
					
					c = j - 1;
					while (c >= 0 && matrix[i][c] == '.') {
						area++;
						c--;
					}
					
					c = j + 1;
					while (c < n && matrix[i][c] == '.') {
						area++;
						c++;
					}
					res = Math.max(res, area);
				}
			}
		}
		
		System.out.println(res);
	}
	
	private static void printNums(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("");
	}
	
	private static void printMatrix(char[][] M) {
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.println(M[i][j]+" ");
			}
		}
		System.out.println("");
	}

}
