import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		int ns = s.length, nt = t.length;
		if(!check(s, t, ns, nt)) {
			System.out.println("UNRESTORABLE");
			return;
		}
		for(int i = 0 ; i < ns ; i++) {
			if(s[i] == '?') {
				for(char c = 'a' ; c <= 'z' ; c++) {
					s[i] = c;
					if(check(s, t, ns, nt)) {
						break;
					}
				}
			}
		}
		String ans = "";
		for(int i = 0 ; i < ns ; i++) {
			ans += s[i];
		}
		System.out.println(ans);
	}

	public static boolean check(char[] s, char[] t, int ns, int nt) {
		for(int i = 0 ; i < ns - nt + 1 ; i++) {
			boolean ok = true;
			for(int j = 0 ; j < nt ; j++) {
				if(s[i + j] == t[j] || s[i + j] == '?');
				else ok = false;
			}
			if(ok) return true;
		}
		return false;
	}

}