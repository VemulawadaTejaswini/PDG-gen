import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		String[] ans = s.split("");

		int index = -1;
		out_of_loop:
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < t.length(); j++) {
				char cs = s.charAt(i + j);
				char ct = t.charAt(j);
				if (!((cs != '?' && cs == ct) || cs == '?')) {
					break;
				}
				if (t.length() > s.length() - i) {
					System.out.println("UNRESTORABLE");
					return;
				}
				if (j == t.length() - 1) {
					index = i;
					break out_of_loop;
				}
			}
		}

		for (int i = 0; i < t.length(); i++) {
			ans[index + i] = String.valueOf(t.charAt(i));
		}

		for (int i = 0; i < s.length(); i++) {
			if (ans[i].equals("?")) {
				System.out.print("a");
			} else {
				System.out.print(ans[i]);
			}
		}

	}
}