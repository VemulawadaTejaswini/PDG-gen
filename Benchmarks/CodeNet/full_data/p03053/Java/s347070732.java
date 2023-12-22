import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		String matrix[][] = new String[h][w];

		int blackCount = 0;

		for (int i = 0; i < h; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < w; j++) {
				matrix[i][j] = str[j];
				if (matrix[i][j].equals("#")) {
					blackCount++;
				}
			}
		}

		int ans = 0;

		while (blackCount != w * h) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (matrix[i][j].equals("#")) {
						if (i > 0) {
							if (matrix[i - 1][j].equals(".")) {
								matrix[i - 1][j] = "#";
								blackCount++;
							}
						}
						if (i < h - 1) {
							if (matrix[i + 1][j].equals(".")) {
								matrix[i + 1][j] = "$";
								blackCount++;
							}
						}
						if (j > 0) {
							if (matrix[i][j - 1].equals(".")) {
								matrix[i][j - 1] = "#";
								blackCount++;
							}
						}
						if (j < w - 1) {
							if (matrix[i][j + 1].equals(".")) {
								matrix[i][j + 1] = "$";
								blackCount++;
							}
						}
					} else if (matrix[i][j].equals("$")) {
						matrix[i][j] = "#";
					}
				}
			}
			ans++;
		}

		System.out.println(ans);
	}
}