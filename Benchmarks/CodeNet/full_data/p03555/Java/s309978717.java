import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder a = new StringBuilder(sc.next());
		StringBuilder c = new StringBuilder(a).reverse();
		StringBuilder b = new StringBuilder(sc.next());
		StringBuilder d = new StringBuilder(b).reverse();
		System.out.println((c.compareTo(b)==0 && d.compareTo(a)==0) ? "YES" : "NO");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}