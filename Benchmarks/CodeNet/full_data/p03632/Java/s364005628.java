import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
		int t = Math.min(B,D)-Math.max(A,C);
		System.out.println(t<0 ? 0 : t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}