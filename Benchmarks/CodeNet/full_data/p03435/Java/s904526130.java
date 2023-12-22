import java.util.Scanner;

public class Main {

	static int c[][] = new int[3][3];

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i <= 100; i++) {
			if (judge(i)) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");

	}

	private static boolean judge(int i) {
		int b1 = c[0][0] - i;
		int b2 = c[0][1] - i;
		int b3 = c[0][2] - i;
		boolean jua2 = false;
		boolean jua3 = false;
		for (int j = 0; j <= 100; j++) {
			if (c[1][0] - b1 == j && c[1][1] - b2 == j && c[1][2] - b3 == j)
				jua2 = true;
		}
		for (int j = 0; j <= 100; j++) {
			if (c[2][0] - b1 == j && c[2][1] - b2 == j && c[2][2] - b3 == j)
				jua3 = true;
		}

		if (0 <= b1 && b1 <= 100 && 0 <= b2 && b2 <= 100 && 0 <= b3 && b3 <= 100 && jua2 && jua3)
			return true;
		else
			return false;

	}

}
