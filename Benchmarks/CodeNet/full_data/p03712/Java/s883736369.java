import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt(), n=r;
		System.out.println("#"+"#".repeat(c)+"#");
		while (n-->0) System.out.println("#"+sc.next()+"#");
		System.out.println("#"+"#".repeat(c)+"#");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}