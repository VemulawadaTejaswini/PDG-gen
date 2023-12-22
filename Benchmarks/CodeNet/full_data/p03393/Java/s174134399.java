import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println("-1");
			return;
		}
		String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String[] t = s.split("");
		if (s.length() == 26) {
			for (int i = 24; i >= 0; i--) {
				for (int j = 0; j < 26; j++) {
					boolean exist = false;
					for (int k = 0; k < i; k++) {
						if (a[j].equals(t[k])) {
							exist = true;
							break;
						}
					}
					if (!exist) {
						if (s.charAt(i) < a[j].charAt(0)) {
							System.out.println(s.substring(0, i) + a[j]);
							return;
						}
					}
				}
			}
		}
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