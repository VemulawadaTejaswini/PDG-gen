import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[256];
		boolean ok = false;
		for (char ch : sc.next().toCharArray()) if (++c[ch]>=3) ok=true;
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}