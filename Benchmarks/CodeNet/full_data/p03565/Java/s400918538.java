import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ss = sc.next();
		String tt = sc.next();
		sc.close();

		char[] s = ss.toCharArray();
		char[] t = tt.toCharArray();
		int n = s.length;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append('z');
		}
		String z = sb.toString();
		String ans = z;

		String a = ss.replaceAll("\\?", "a");
		for (int i = 0; i <= n - t.length; i++) {
			boolean flg = true;
			for (int j = 0; j < t.length; j++) {
				if (s[i + j] != '?' && s[i + j] != t[j]) {
					flg = false;
					break;
				}
			}
			if (flg) {
				String val = a.substring(0, i) + tt;
				if (val.length() < n) {
					val += a.substring(i + t.length);
				}
				if (val.compareTo(ans) < 0) {
					ans = val;
				}
			}
		}
		if (ans.equals(z)) {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(ans);
		}
	}
}
