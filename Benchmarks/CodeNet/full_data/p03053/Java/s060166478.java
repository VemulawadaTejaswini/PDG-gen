import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean[][] table = new boolean[h][w];

		for (int i = 0; i < h; i++) {
			String aLine = sc.next();
			String[] aArray = aLine.split("");
			for (int j = 0; j < w; j++) {
				String a = aArray[j];
				table[i][j] = a.equals("#") ? true : false;
			}
		}

		long count = 0;
		boolean[] canSkip = new boolean[h];
		for (int k = 0; k < h * w + 1; k++) {
			boolean thereIsWhite = false;
			boolean[][] nextTable = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				if (canSkip[i]) {
					continue;
				}
				boolean thisLineIsAllBlack = true;
				for (int j = 0; j < w; j++) {

					boolean isBlack = table[i][j];
					// System.out.print(isBlack + " ");
					if (isBlack) {
						nextTable[i][j] = true;
						if (j < w - 1) {
							nextTable[i][j + 1] = true;
						}
						if (j != 0) {
							nextTable[i][j - 1] = true;
						}
						if (i < h - 1) {
							nextTable[i + 1][j] = true;
						}
						if (i != 0) {
							nextTable[i - 1][j] = true;
						}
					} else {
						thisLineIsAllBlack = false;
						thereIsWhite = true;
					}
				}
				if (thisLineIsAllBlack) {
					canSkip[i] = true;
				}
				// System.out.println();
			}
			// System.out.println();
			if (thereIsWhite) {
				count++;
				table = nextTable;
				continue;
			} else {
				break;
			}
		}
		System.out.println(count);

	}
}