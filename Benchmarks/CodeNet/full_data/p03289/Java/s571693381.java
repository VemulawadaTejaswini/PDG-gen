import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(check(s) ? "AC" : "WA");
	}

	static boolean check(String s) {
		int cnt = 0;
		if(s.charAt(0) != 'A') return false;
		for (int i = 1; i < s.length(); i++) {
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				if(i == 1 || i == s.length() - 1 || s.charAt(i) != 'C') return false;
				cnt++;
			}
		}
		if(cnt != 1) return false;

		return true;
	}
}