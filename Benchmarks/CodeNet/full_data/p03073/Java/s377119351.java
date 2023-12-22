import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = 0;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				//s = s.substring(0, i) + String.valueOf((Integer.valueOf(s.charAt(i)) + 1) % 2) + s.substring(i + 1, s.length());
				answer++;
			}
		}
		System.out.println(answer);
	}
}
