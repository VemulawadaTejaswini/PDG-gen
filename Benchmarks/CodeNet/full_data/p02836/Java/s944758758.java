import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		String s = sc.next();
		int n = s.length();
		int ret = 0;
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				ret++;
			}
		}
		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}