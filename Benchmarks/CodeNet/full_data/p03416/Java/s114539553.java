import java.util.*;
// warm-up
public class Main {

	static boolean isPalindrome (String s) {
		int i=0, j=s.length()-1;
		boolean ok = true;
		while (i<j) {
			if (s.charAt(i++)!=s.charAt(j--)) {
				ok=false; break;
			}
		}
		return ok;
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), t = 0;
		while (A<=B) if (isPalindrome(""+A++)) t++;
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}