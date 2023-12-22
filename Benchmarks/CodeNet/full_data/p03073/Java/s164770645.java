import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int answer = 0;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				if (s.charAt(i) == '0') {
					s.setCharAt(i, '1');
				} else {
					s.setCharAt(i, '0');
				}
				answer++;
			}
		}
		System.out.println(answer);
	}
}
