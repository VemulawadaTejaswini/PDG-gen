import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		int a = 0;
		int b = 0;
		int ab = 0;
		int contain = 0;
		for (int i = 0; i < n; i++) {
			if (s[i].charAt(0) == 'B' && s[i].charAt(s[i].length() - 1) == 'A') {
				ab++;
			}
			if (s[i].charAt(0) == 'B') {
				b++;
			}
			if (s[i].charAt(s[i].length() - 1) == 'A') {
				a++;
			}
			while (s[i].indexOf("AB") != -1) {
				contain++;
				s[i] = s[i].substring(s[i].indexOf("AB") + 2);
			}
		}
		if (a == b && ab == a) {
			System.out.println(contain + ab - 1);
		} else {
			System.out.println(contain + Math.min(a, b));
		}
	}
}