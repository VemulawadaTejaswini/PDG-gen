import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = n/2, t = 2;
		boolean ok = false;
		while (n-->0) {
			int a = sc.nextInt();
			if (a%4==0) k--;
			else if ((a&1)==0) t--;
			if (t==0) { t=2; k--; }
			if (k==0) { ok = true; break; }
		}
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}