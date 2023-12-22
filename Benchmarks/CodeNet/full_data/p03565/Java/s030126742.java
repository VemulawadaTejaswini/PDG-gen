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
				for (int i = c; i < t.length(); i++) {
					if (s.contains(str + t.substring(i, i + 1))) {
						str += t.substring(i, i + 1);
					} else {
						str += "?";
					}
				}
				if (s.contains(str)) {
					for (int i = 0; i < (s.length() - t.length()); i++) {
						if (s.substring(i).startsWith(str)) {
							if (i == 0) {
								str = str + s.substring(t.length());
							} else {
								int j = i;
								while (j >= 0) {
									bil += "a";
									j--;
								}
								str = bil + str + s.substring(t.length());
							}
						}
					}
					ans = str.replaceAll("?", "a");
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
