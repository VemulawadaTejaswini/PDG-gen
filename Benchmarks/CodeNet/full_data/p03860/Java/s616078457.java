import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		while (sc.hasNext()) s.append(sc.next().charAt(0));
		System.out.println(s);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}