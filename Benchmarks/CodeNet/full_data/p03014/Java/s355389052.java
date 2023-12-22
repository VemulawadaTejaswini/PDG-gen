import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String str = "";
		char[][] matrix = new char[H][W];
		for (int i = 0; i < H; i++) {
			str = sc.next();
			for (int j = 0; j < W; j++) {
				matrix[i][j] = str.charAt(j);
			}
		}
		int total = 1;
		int max = 0;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (matrix[i][j] == '.') {
					for (int k = i + 1; k < H; k++) {
						if (matrix[k][j] == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int k = i - 1; k >= 0; k--) {
						if (matrix[k][j] == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int l = j + 1; l < W; l++) {
						if (matrix[i][l] == '.') {
							total++;
						} else {
							break;
						}
					}
					for (int l = j - 1; l >= 0; l--) {
						if (matrix[i][l] == '.') {
							total++;
						} else {
							break;
						}
					}
					if (total > max) {
						max = total;
					}
					total = 1;

				}

			}
		}
		System.out.println(max);
	}

}
