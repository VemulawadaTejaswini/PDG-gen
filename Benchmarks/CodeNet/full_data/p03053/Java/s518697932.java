import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	static int h;
	static int w;

	static String matrix[][];

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		h = Integer.parseInt(str[0]);
		w = Integer.parseInt(str[1]);

		matrix = new String[h][w];

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
						matrix[i][j] = "%";
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