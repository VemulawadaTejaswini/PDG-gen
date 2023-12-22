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
		for(int i = 0; i < n; i++) {
			try {
				String compare = sp.substring(i, i + m);
				if(check(compare, t)) {
					compare = t;
					for(int j = 0; j < i; j++) System.out.print(sp.charAt(j) == '?' ? 'a' : sp.charAt(j));
					System.out.print(compare);
					for(int j = i + m; j < n; j++) System.out.print(sp.charAt(j) == '?' ? 'a' : sp.charAt(j));
					return;
				}
			} catch(Exception e) {
				System.out.println("UNRESTORABLE");
				return;
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
