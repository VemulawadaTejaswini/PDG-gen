import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), t = sc.nextInt();
		System.out.println(X-t<0 ? 0 : X-t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}