import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		StringBuffer rs = new StringBuffer(s);
		StringBuffer rt = new StringBuffer(t);
		rs = rs.reverse();
		rt = rt.reverse();
		char[] cs = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			cs[i] = rs.charAt(i);
		}
		
		char[] ct = new char[t.length()];
		for (int i = 0; i < t.length(); i++) {
			ct[i] = rt.charAt(i);
		}
		int X = Integer.MAX_VALUE;
		for (int i = 0; i < s.length()-t.length(); i++) {
			boolean f = true;
			for (int j = 0; j < t.length(); j++) {
				if (cs[i+j] != '?' && cs[i+j] != ct[j]) {
					f = false;
					break;
				}
			}
			if (f) {
				X = i;
				break;
			}
		}
		if (X == Integer.MAX_VALUE) {
			System.out.println("UNRESTORABLE");
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			if (cs[i] == '?') {
				cs[i] = 'a';
			}
		}
		for (int i = X; i < t.length(); i++) {
			cs[i] = ct[i];
		}
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(cs[i]);
		}
		System.out.println("");
	}
}
