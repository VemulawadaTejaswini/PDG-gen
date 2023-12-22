import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		System.out.println((""+t.charAt(0))+(t.length()-2)+(""+t.charAt(t.length()-1)));
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}