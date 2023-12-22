import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		String t = sc.next();
		String ans = "UNRESTORABLE", str = "";
		int c = 0;

		if (t.length() <= s.length()) {
			for (int i = t.length() - 1; i >= 0; i--) {
				c = i;
				if (s.contains(t.substring(i, i + 1))) {
					str = t.substring(i, i + 1) + str;
					break;
				} else {
					str = "?" + str;
				}
			}
			if (str.length() < t.length()) {
				for (int i = c - 1; i >= 0; i--) {
					if (s.contains(t.substring(i, i + 1) + str)) {
						str = t.substring(i, i + 1) + str;
					} else {
						str = "?" + str;
					}
					// str 与えられた文字列に含まれているt
				}
			}
			if (s.contains(str)) {
				for (int i = s.length() - t.length(); i >= 0; i--) {
					if (s.substring(i, i + t.length()).equals(str)) {
						if (i == (s.length() - t.length())) {
							str = s.substring(0, i) + t;
						} else {
							str = s.substring(0, i) + t + s.substring(i + t.length());
						}
						break;
					}
				}
				ans = str.replaceAll("[?]", "a");
			}

		}
		System.out.println(ans);

		sc.close();
	}
}