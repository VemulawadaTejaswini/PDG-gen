import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		String sp = scan.next();
		String t = scan.next();
		if(sp.length() < t.length()) {
			System.out.println("UNRESTORABLE");
			return;
		}
		int n = sp.length();
		int m = t.length();
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n - m + 1; j++) {
				String compare = sp.substring(j, j + m);
				if(check(compare, t)) {
					compare = t;
					for(int k = 0; k < j; k++) {
						System.out.print(sp.charAt(k) == '?' ? 'a' : sp.charAt(k));
					}
					System.out.println(compare);
					return;
				}
			}
		}
		System.out.println("UNRESTORABLE");
		scan.close();
	}
	
	boolean check(String s, String t) {
		for(int i = 0; i < t.length(); i++) {
			if(s.charAt(i) != '?' && s.charAt(i) != t.charAt(i)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
