
import java.util.Scanner;

public class Main {

	static boolean check(String s) {
		boolean ret = true;
		for(int i = 0; i < s.length() / 2; i++) {
			ret = ret && (s.charAt(i) == s.charAt(s.length() - 1 - i));
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = s.substring(0, (s.length() - 1) / 2);
		String u = s.substring((s.length() + 1) / 2);
		System.out.println(check(s) && check(t) && check(u) ? "Yes" : "No");
	}

}
