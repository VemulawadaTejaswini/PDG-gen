import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		int ns = s.length, nt = t.length;
		if(ns < nt) {
			System.out.println("UNRESTORABLE");
			return;
		}
		if(check1(s, t)) {
			for(int i = 0 ; i < ns ; i++) {
				if(s[i] == '?') {
					s[i] = 'a';
				}
			}
			String ans = "";
			for(int i = 0 ; i < ns ; i++) {
				ans += s[i];
			}
			System.out.println(ans);
			return;
		}
		boolean ok = false;
		for(int i = ns - 1 ; i >= nt - 1 ; i--) {
			if(s[i] == '?') {
				if(check(s, t, i)) {
					ok = true;
					for(int j = 0 ; j < nt ; j++) {
						s[i - j] = t[nt - 1 - j];
					}
					break;
				}
			}
		}
		if(ok == false) {
			System.out.println("UNRESTORABLE");
			return;
		}
		for(int i = 0 ; i < ns ; i++) {
			if(s[i] == '?') {
				s[i] = 'a';
			}
		}
		String ans = "";
		for(int i = 0 ; i < ns ; i++) {
			ans += s[i];
		}
		System.out.println(ans);
	}

	public static boolean check(char[] s, char[] t, int i) {
		boolean ok = true;
		int nt = t.length;
		for(int j = 0 ; j < nt ; j++) {
			if(!(s[i - j] == t[nt - 1 - j] || s[i - j] == '?')) {
				ok = false;
			}
		}
		return ok ? true : false;
	}

	public static boolean check1(char[] s, char[] t) {
		int ns = s.length;
		int nt = t.length;
		for(int i = 0 ; i < ns - nt ; i++) {
			boolean ok = true;
			for(int j = 0 ; j < nt ; j++) {
				if(s[ns - 1 - i - j] != t[nt - 1 - j]) {
					ok = false;
				}
			}
			if(ok) return true;
		}
		return false;
	}


}