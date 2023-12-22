import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a1;
		int a2;
		int a3;

		int HUNDRED = 100;

		boolean flag = false;

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				c[i][j] = sc.nextInt();

			}
		}

		for (a1 = 0; a1 <= HUNDRED && !flag; a1++) {
			int b1 = c[0][0] - a1;
			int b2 = c[0][1] - a1;
			int b3 = c[0][2] - a1;

			for (a2 = 0; a2 <= HUNDRED && !flag; a2++) {

				if (c[1][0] == a2 + b1 && c[1][1] == a2 + b2 && c[1][2] == a2 + b3) {

					for (a3 = 0; a3 <= HUNDRED && !flag; a3++) {
						if (c[2][0] == a3 + b1 && c[2][1] == a3 + b2 && c[2][2] == a3 + b3) {
							flag = true;
						}
					}
				}
			}
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}
}