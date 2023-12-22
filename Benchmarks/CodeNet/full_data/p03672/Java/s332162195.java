import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String tok = sc.next();
		char[] c = tok.toCharArray();
		int t = 0;
		for (int i=c.length-2; i>=1; i--) {
			if ((i&1)==0) continue;
			String a = tok.substring(0, (i+1)/2);
			String b = tok.substring((i+1)/2, i+1);
			if (a.compareTo(b)==0) {
				t+=a.length()+b.length();
				break;
			}
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}