import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[256];
		String tok = sc.next();
		boolean ok = true;
		for(char ch: tok.toCharArray()) c[(int)ch]++;
		for (char ch : tok.toCharArray()) if (c[(int)ch]%2!=0) { ok=false; break; }
		System.out.println(ok ? "Yes" : "No");
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}

}
