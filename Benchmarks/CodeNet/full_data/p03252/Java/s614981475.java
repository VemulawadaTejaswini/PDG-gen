import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		int n = s.length;

		char[] ch = new char[26];
		for (char c = 'a'; c <= 'z'; c++) {
			ch[c - 'a'] = c;
		}
		
		for (int i = 0; i < n; i++) {
			if (ch[s[i] - 'a'] != t[i]) {
				int j;
				for (j = 0; j < 26 && ch[j] != t[i]; j++) {
				}
				
				char tmp = ch[s[i] - 'a']; ch[s[i] - 'a'] = ch[j]; ch[j] = tmp;
			}
		}

		for (int i = 0; i < n; i++) {
			if (ch[s[i] - 'a'] != t[i]) {
				pr.println("No");
				return;
			}
		}
		
		pr.println("Yes");
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
