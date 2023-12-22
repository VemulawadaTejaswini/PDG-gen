import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			long cnt = 0;
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
