import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean non = false;
		int start = 0;
		outside : for(int i = 0; i < s.length() - t.length() + 1; i++) {
			for(int j = 0; j < t.length(); j++) {
				if(!(s.charAt(i + j) == '?' || s.charAt(i + j) == t.charAt(j))) {
					break;
				}
				if(j == t.length() - 1) {
					start = i;
					break outside;
				}
			}
			if(i == s.length() - t.length()) {
				non = true;
			}
		}
		if(non) {
			System.out.println("UNSRESTORABLE");
			return;
		}
		for(int i = 0; i < start; i++) {
			if(s.charAt(i) == '?') {
				System.out.print('a');
			} else {
				System.out.print(s.charAt(i));
			}
		}
		System.out.print(t);
		for(int i = start + t.length(); i < s.length(); i++) {
			if(s.charAt(i) == '?') {
				System.out.print('a');
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}