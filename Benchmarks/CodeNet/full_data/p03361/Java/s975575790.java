import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		String s[][] = new String[h][w];

		for (int i = 0; i < h; i++) {
			s[i] = scanner.next().split("");
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j].equals("#")) {
					if (check4Neighborhood(s, j, i)) {
						continue;
					} else {
						System.out.println("No");
						return;
					}
				}
			}
		}

		System.out.println("Yes");

	}

	private static boolean check4Neighborhood(String[][] s, int x, int y) {
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if ((i == 0 && j != 0) || (i != 0 && j == 0)) {
					int tarX = j + x;
					int tarY = i + y;
					if (0 <= tarX && tarX <= s[0].length-1 && 0 <= tarY && tarY <= s.length-1) {
						if (s[tarY][tarX].equals("#")) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
