import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sd = sc.next();
		String t = sc.next();
		String s = getS(sd, t);

		System.out.println(s);

		sc.close();
	}

	static String getS(String s, String t) {
		if (s.length() < t.length()) {
			return "UNRESTORABLE";
		}
		String[] candidates = new String[s.length() - t.length() + 1];
		for (int i = 0; i <= s.length() - t.length(); i++) {
			String x = s.substring(i, i + t.length());
			if (isEqual(x, t)) {
				String tmp = "";
				if (i != 0) {
					tmp += s.substring(0, i);
				}
				tmp += t;
				if (i != s.length() - t.length()) {
					tmp += s.substring(i + x.length());
				}
				tmp = tmp.trim();
				candidates[i] = "";
				for (int j = 0; j < tmp.length(); j++) {
					if (tmp.charAt(j) == '?') {
						candidates[i] += 'a';
					} else {
						candidates[i] += tmp.charAt(j);
					}
				}
			} else {
				candidates[i] = "UNRESTORABLE";
			}
		}
		Arrays.sort(candidates);

//		for (String str : candidates) {
//			System.out.println(str);
//		}
		return candidates[0];
	}

	static boolean isEqual(String x, String t) {
		for (int i = 0; i < x.length(); i++) {
			char xi = x.charAt(i);
			char ti = t.charAt(i);
			if (xi != '?' && xi != ti) {
				return false;
			}
		}
		return true;
	}



}
