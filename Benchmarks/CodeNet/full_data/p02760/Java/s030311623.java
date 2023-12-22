import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer[][] bingo = new Integer[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		int num = 0;

		try {

			while (sc.hasNextLine()) {
				num = sc.nextInt();

				for (int i = 0; i < 3; i++) {
					List<Integer> list = Arrays.asList(bingo[i]);
					int j = list.indexOf(num);
					if (j > -1) {
						bingo[i][j] = -1;
					}
				}
			}

		}catch (NoSuchElementException e) {
		}

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += bingo[i][j];
				if (sum > -1) {
					break;
				} else if (sum == -3) {
					System.out.println("Yes");
					return;
				}
			}
			sum = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += bingo[i][j];
				if (sum > -1) {
					break;
				} else if (sum == -3) {
					System.out.println("Yes");
					return;
				}
			}
			sum = 0;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					sum += bingo[i][j];
					if (sum > -1) {
						break;
					} else if (sum == -3) {
						System.out.println("Yes");
						return;
					}
				}
			}
			sum = 0;
		}

		for (int i = 2; i < 3; i++) {
			for (int j = 0; j <= 2 - i; j++) {
				if (2 - i == j) {
					sum += bingo[i][j];
					if (sum > -1) {
						break;
					} else if (sum == -3) {
						System.out.println("Yes");
						return;
					}
				}
			}
			sum = 0;
		}

		System.out.println("No");

	}
}
