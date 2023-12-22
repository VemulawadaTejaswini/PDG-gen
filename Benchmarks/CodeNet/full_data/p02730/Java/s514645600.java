import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		String s = sc.next();

		int n = s.length();

		boolean kaibun = true;
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {
				kaibun = false;
				break;
			}
		}
		if (kaibun) {
			String s1 = s.substring(0, n / 2);
			int n1 = s1.length();
			boolean kaibun1 = true;
			for (int i = 0; i < n1; i++) {
				if (s1.charAt(i) != s1.charAt(n1 - 1 - i)) {
					kaibun1 = false;
					break;
				}
			}
			if (kaibun1) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		} else {
			out.println("No");
		}

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}