import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		String[] s = new String[N + 1];
		String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] c = b;

		for (int i = 0; i <= N; i++) {
			s[i] = sc.nextLine();
		}

		// 文字列ごとのループ
		for (int i = 1; i <= N; i++) {
			// 文字ごとのループ
			for (int j = 0; j < s[i].length(); j++) {
				// アルファベットごとのループ
				for (int k = 0; k < 26; k++) {
					String str = s[i].substring(j, j + 1);
					if (i != 1 && b[k] == 0) {
						continue;
					}
					if (a[k].equals(str)) {
						c[k]++;
						break;
					}
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			while (c[i] >= 3) {
				System.out.print(a[i]);
				c[i] -= 3;
			}
		}

		sc.close();
	}
}
