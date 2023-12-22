import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		boolean b = true;
		String strn = null;

		String[][] str = new String[H][W];

		for (int i = 0; i < H; i++) {
			strn = s.next();
			String[] str2 = strn.split("");
			for (int j = 0; j < W; j++) {
				str[i][j] = str2[j];
			}
		}

		for (int i = 1; i < H-1; i++) {
			if (b == true) {
				System.out.println(i);
				for (int j = 1; j < W-1; j++) {
					if (str[i][j] == "#") {
						if (i == 0 && j == 0) {
							if (str[i][j + 1].equals("#") || str[i + 1][j].equals("#")) {
								b = true;
							} else {
								b = false;
								break;
							}
						} else if (i == 0 && j == W) {
							if (str[i][j - 1].equals("#") || str[i + 1][j].equals("#")) {
								b = true;
							} else {
								b = false;
								break;
							}

						} else if (i == 0) {
							if (str[i][j - 1].equals("#") || str[i][j + 1].equals("#") || str[i + 1][j].equals("#")) {
								b = true;
							} else {
								b = false;
								break;
							}
						} else if (i == H && j == W) {
							if (str[i][j - 1].equals("#") || str[i - 1][j].equals("#")) {
								b = true;
							} else {
								b = false;
								break;
							}
						} else if (i == H && j == 0) {
							if (str[i - 1][j].equals("#") || str[i][j + 1].equals("#")) {
								b = true;
							} else {
								b = false;
								break;
							}
						} else if (j == W) {
							if (str[i][j - 1].equals("#") || str[i - 1][j].equals("#") || str[i + 1][j].equals("#")) {
								b = true;
							} else {
								b = false;
								break;
							}
						} else {
							if (str[i][j - 1].equals("#") || str[i - 1][j].equals("#") ||
									str[i + 1][j].equals("#") || str[i][j + 1].equals("#")) {
								b = true;
								break;
							}
						}
					}
				}

			}
		}
		String ans = b ? "Yes" : "No";
		System.out.println(ans);
	}

}
