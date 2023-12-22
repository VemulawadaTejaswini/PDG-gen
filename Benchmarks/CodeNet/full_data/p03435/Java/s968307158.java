import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int c[][] = new int[3][3];
		boolean b = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		loop: for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (c[i][0] - c[j][0] == c[i][1] - c[j][1] && c[i][1] - c[j][1] == c[i][2] - c[j][2]) {

				} else {
					b = false;
					break loop;
				}
			}
		}

		loop: for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (c[0][i] - c[0][j] == c[1][i] - c[1][j] && c[1][i] - c[1][j] == c[2][i] - c[2][j]) {

				} else {
					b = false;
					break loop;
				}
			}
		}

		if (b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
