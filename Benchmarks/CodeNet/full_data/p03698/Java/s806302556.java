import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String S = sc.next();
		String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		int[] b = new int[26];
		String ans = "yes";

		for (int j = 0; j < S.length(); j++) {
			for (int i = 0; i < 26; i++) {
				if (S.substring(j, j + 1).equals(a[i])) {
					b[i]++;
					if (b[i] > 1) {
						ans = "no";
						break;
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}