import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		String[] s = new String[h];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}

		char[][] ans = new char[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i].charAt(j) == '#') {
					ans[i][j] = '#';
					continue;
				}
				int count = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					if (k < 0 || h <= k) {
						continue;
					}
					for (int l = j - 1; l <= j + 1; l++) {
						if (l < 0 || w <= l) {
							continue;
						}
						if (s[k].charAt(l) == '#') {
							count++;
						}
					}
				}
				ans[i][j] = (char)('0' + count);
			}
		}

		for (char[] arr : ans) {
			for (char c : arr) {
				System.out.print(c);
			}
			System.out.println();
		}

		sc.close();
	}
}
