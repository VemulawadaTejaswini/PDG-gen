import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		boolean ok = ((a+b)%3==0 || a%3==0 || b%3==0);
		System.out.println(ok ? "Possible" : "Impossible");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}
