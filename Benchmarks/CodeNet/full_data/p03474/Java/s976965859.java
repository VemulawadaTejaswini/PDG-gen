import java.util.*;

// ARC 86-D
// https://beta.atcoder.jp/contests/arc086/tasks/arc086_b

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		String s = in.next();
		
		boolean isValid = true;
		if (s.length() != A + B + 1) {
			isValid = false;
		}
		if (s.charAt(A) != '-') {
			isValid = false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (i != A && !('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
				isValid = false;
			}
		}
		System.out.println(isValid ? "Yes" : "No");
	}
}
