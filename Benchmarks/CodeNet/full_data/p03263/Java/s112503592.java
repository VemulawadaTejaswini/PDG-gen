import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int[][] matrix = new int[h][w];
		int odd = 0;
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < w; i++) {
				int c = scanner.nextInt();
				matrix[j][i] = c;
				if (c % 2 == 1) {
					odd++;
				}
			}
		}
		int i = 0;
		int j = 0;
		int previ = 0;
		int prevj = 0;
		List<String> opeList = new ArrayList<String>();
		boolean isOpe = false;
		while (1 < odd) {
			int curVal = matrix[j][i];
			boolean isOdd = curVal % 2 == 1;

			// OPERATION
			if (isOpe && isOdd) {
				opeList.add(prevj + " " + previ + " " + j + " " + i);
				isOpe = false;
				odd -= 2;
			} else if (isOpe && !isOdd) {
				opeList.add(prevj + " " + previ + " " + j + " " + i);
			} else if (!isOpe && isOdd) {
				isOpe = true;
			}

			// MOVE
			previ = i;
			prevj = j;
			boolean moveRight = j % 2 == 0;
			if (moveRight) {
				if (i == w - 1) {
					j++;
				} else {
					i++;
				}
			} else {
				if (i == 0) {
					j++;
				} else {
					i--;
				}
			}
		}

		System.out.println(opeList.size());
		for (String ope : opeList) {
			System.out.println(ope);
		}
	}
}
