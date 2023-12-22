import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					boolean flg = false;
					if (i > 0 && s[i - 1][j] == '#') flg = true;
					if (i < h - 1 && s[i + 1][j] == '#') flg = true;
					if (j > 0 && s[i][j - 1] == '#') flg = true;
					if (j < w - 1 && s[i][j + 1] == '#') flg = true;
					if (!flg) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
