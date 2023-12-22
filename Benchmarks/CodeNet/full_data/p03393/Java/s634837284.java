import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println("-1");
			return;
		}
		if (s.length() == 26) {
			int i = 24;
			while (s.charAt(i + 1) < s.charAt(i)) {
				i--;
			}
			System.out.println(s.substring(0, i) + String.valueOf(((char)(s.charAt(i) + 1))));
			return;
		}
		String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] t = s.split("");
		for (int i = 0; i < a.length; i++) {
			boolean exist = false;
			for (int j = 0; j < t.length; j++) {
				if (a[i].equals(t[j])) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				System.out.println(s + a[i]);
				return;
			}
		}
	}
}