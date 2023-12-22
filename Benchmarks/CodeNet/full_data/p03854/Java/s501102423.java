import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean end = true;
		while (end) {
			if (s.length() == 0) {
				System.out.println("YES");
				return;
			} else if (s.length() < 5) {
				System.out.println("NO");
				return;
			}
			if (s.length() >= 7) {
				String str = s.substring(s.length() - 7);
				if (str.equals("dreamer")) {
					s = s.substring(0, s.length() - 7);
					continue;
				}
			}
			if (s.length() >= 6) {
				String str = s.substring(s.length() - 6);
				if (str.equals("eraser")) {
					s = s.substring(0, s.length() - 6);
					continue;
				}
			}
			if (s.length() >= 5) {
				String str = s.substring(s.length() - 5);
				if (str.equals("erase")) {
					s = s.substring(0, s.length() - 5);
					continue;
				} else if (str.equals("dream")) {
					s = s.substring(0, s.length() - 5);
					continue;
				}
			}
			s = "a";
		}
	}
}