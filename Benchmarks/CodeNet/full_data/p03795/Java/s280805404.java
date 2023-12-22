import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((n*800)-(200*(n/15)));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}