import java.util.*;

// ABC 50-C
// http://abc050.contest.atcoder.jp/tasks/arc066_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		boolean isValid = true;
		
		// Investigate from the end of the string
		while (s.length() > 0 && isValid) {
			int l = s.length();
			// Check dream
			if (l >= 5 && s.substring(l - 5).equals("dream")) {
				s = s.substring(0, l - 5);
				continue;
			}
			// Check dreamer
			if (l >= 7 && s.substring(l - 7).equals("dreamer")) {
				s = s.substring(0, l - 7);
				continue;
			}
			// Check erase
			if (l >= 5 && s.substring(l - 5).equals("erase")) {
				s = s.substring(0, l - 5);
				continue;
			}
			// Check eraser
			if (l >= 6 && s.substring(l - 6).equals("eraser")) {
				s = s.substring(0, l - 6);
				continue;
			}
			isValid = false;
		}
		System.out.println(isValid ? "YES" : "NO");
		
	}
}