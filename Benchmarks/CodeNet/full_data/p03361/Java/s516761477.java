import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// 整数の入力
		// int a = sc.nextInt();
		// スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// 文字列の入力
		// String s = sc.next();
		// 出力
		// System.out11.println((a+b+c) + " " + s);

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int[][] matrix = new int[h][w];



		for (int i = 0; i < h; i++) {
			String str = sc.next();
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str.charAt(j);
			}
		}



		boolean result = true;

		for (int i = 0; i < h; i++) {
			for (int j =0; j < w; j++) {
				if (matrix[i][j] == '#') {
					if (!check4(matrix, i, j, h, w)) {
						result = false;
						break;
					}
				}
			}
		}


		System.out.println(result ? "Yes" : "No");


	}

	private static boolean check4(int[][] mat, int i, int j, int h, int w) {

		boolean result = true;
		if (i == 0 && j == 0) {
			result = (mat[i+1][j] == '#' || mat[i][j+1] == '#');
		} else if (i ==0 && j == w-1) {
			result = (mat[i][j-1] == '#' || mat[i+1][j] == '#');
		} else if (i == h-1 && j==0) {
			result = (mat[i-1][j] == '#' || mat[i][j+1] == '#');
		} else if (i==h-1 && j==w-1) {
			result = (mat[i][j-1] == '#' || mat[i-1][j] == '#');
		} else if (i==0) {
			result = (mat[i][j-1] == '#' || mat[i][j+1] == '#' || mat[i+1][j] == '#');
		} else if (j==0) {
			result = (mat[i-1][j] == '#' || mat[i+1][j] == '#' || mat[i][j+1] == '#');
		} else if (i==h-1) {
			result = (mat[i][j-1] == '#' || mat[i][j+1] == '#' || mat[i-1][j] == '#');
		} else if (j == w-1) {
			result = (mat[i-1][j] == '#' || mat[i+1][j] == '#' || mat[i][j-1] == '#');
		} else {
			result = (mat[i][j-1] == '#' || mat[i][j+1] == '#' || mat[i+1][j] == '#' || mat[i-1][j] == '#');
		}

		return result;

	}

}