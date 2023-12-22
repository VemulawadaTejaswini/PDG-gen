import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		int[][] hors = new int[h][w];
		for (int i = 0; i < h; i++) {
			int last = -1;
			int val = 0;
			for (int j = 0; j < w; j++) {
				if (field[i][j] == '#') {
					for (int k = j - 1; k > last; k--) {
						hors[i][k] = val;
					}
					val = 0;
				} else {
					val++;
					hors[i][j] = val;
					if (j == w - 1) {
						for (int k = j; k > last; k--) {
							hors[i][k] = val;
						}
					}
				}
			}
		}
		int[][] vars = new int[h][w];
		for (int i = 0; i < w; i++) {
			int last = -1;
			int val = 0;
			for (int j = 0; j < h; j++) {
				if (field[j][i] == '#') {
					for (int k = j - 1; k > last; k--) {
						vars[k][i] = val;
					}
					val = 0;
				} else {
					val++;
					vars[j][i] = val;
					if (j == h - 1) {
						for (int k = j; k > last; k--) {
							vars[k][i] = val;
						}
					}
				}
			}
		}
		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int x = hors[i][j] + vars[i][j] - 1;
				if (max < x) {
					max = x;
				}
			}
		}
		System.out.println(max);
	}
}
