import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		String[] s = new String[N + 1];
		String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] c = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int d = 0;

		for (int i = 0; i <= N; i++) {
			s[i] = sc.nextLine();
		}

		// 文字列ごとのループ
		for (int i = 1; i <= N; i++) {
			// 文字ごとのループ
			for (int j = 0; j < s[i].length(); j++) {
				// アルファベットごとのループ
				String str = s[i].substring(j, j + 1);
				for (int k = 0; k < 26; k++) {
					if (a[k].equals(str)) {
						c[k]++;
						break;
					}
				}
			}
			for (int j = 0; j < 26; j++) {
				if (i > 1) {
					if (b[j] > 0) {
						if (c[j] < b[j]) {
							int n = Integer.valueOf(c[j]); 
							b[j] = n;
							c[j] = 0;
						} else {
							c[j] = 0;
						}
					} else {
						c[j] = 0;
					}
				} else {
					int n = Integer.valueOf(c[j]); 
					b[j] = n;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			while (b[i] >= 1) {
				System.out.print(a[i]);
				b[i]--;
				d++;
			}
		}
		if (d != 0) {
			System.out.print(" ");
		}

		sc.close();
	}
}
