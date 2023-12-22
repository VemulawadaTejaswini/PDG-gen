import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int len = n / 2;
		int ans = 0;
		int[] c = new int[26];
		boolean f = false;

		for (int i = 0; i < n; i++) {
			c[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < 26; i++) {
			if (c[i] > 1) {
				f = true;
			}
		}

		if (f) {

			loop: while (true) {
				if (len == 1) {
					ans = len;
					break loop;
				} else {
					for (int i = 0; i <= n - (len * 2); i++) {
						for (int j = 0; j <= n - i - len - len; j++) {
							//					System.out.println(s.substring(i, i + len) + " " + s.substring(i + len + j, i + len + len + j));
							if (s.substring(i, i + len).equals(s.substring(i + len + j, i + len + len + j))) {
								ans = len;
								break loop;
							}
						}
					}
				}
				len--;
				if (len == 0) {
					break loop;
				}
			}

		}

		System.out.println(ans);
		sc.close();
	}
}