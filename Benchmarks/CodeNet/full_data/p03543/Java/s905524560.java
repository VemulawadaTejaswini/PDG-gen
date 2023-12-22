import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		String s = sc.next();
		if (s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2)) ok = true;
		else if (s.charAt(1)==s.charAt(2) && s.charAt(2)==s.charAt(3)) ok = true;
		System.out.println(ok ? "Yes" : "No");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}