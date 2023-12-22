import java.util.*;
// warm-up
// Think i should stop doing Atcoder
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String s = "abc", t = sc.next();
		System.out.println(s.indexOf(t.charAt(0))==-1||s.indexOf(t.charAt(1))==-1||s.indexOf(t.charAt(2))==-1 ? "No" : "Yes");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}