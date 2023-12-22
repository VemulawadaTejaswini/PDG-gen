import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		String t = sc.next();
		String ans = "UNRESTORABLE", str = "", bil = "";
		int c = 0;

		if (t.length() <= s.length()) {
			for (int i = 0; i < t.length(); i++) {
				c = i;
				if (s.contains(t.substring(i, i + 1))) {
					str += t.substring(i, i + 1);
					break;
				} else {
					str += "?";
				}
			}
			if (c <= t.length()) {
				for (int i = c + 1; i < t.length(); i++) {
					if (s.contains(str + t.substring(i, i + 1))) {
						str += t.substring(i, i + 1);
					} else {
						str += "?";
					}
					// str 与えられた文字列に含まれているt
				}
				if (s.contains(str)) {
					for (int i = 0; i <= (s.length() - t.length()); i++) {
						if (s.substring(i).startsWith(str)) {
							if (i == 0) {
								str = t + s.substring(t.length());
							} else {
								int j = 0;
								while (j < i) {
									if (!s.substring(j, j + 1).equals("?")) {
										bil += s.substring(j, j + 1);
									} else {
									bil += "a";
									}
									j++;
								}
								str = bil + t + s.substring(t.length() + i);
							}
						}
					}
					ans = str.replaceAll("[?]", "a");
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
