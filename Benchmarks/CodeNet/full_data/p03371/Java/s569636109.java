import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
		int t1 = X*A+Y*B, t2=Math.min(2*C*Math.max(X,Y),  2*C*Math.min(X,Y)+((X>Y) ? (X-Y)*A : (Y-X)*B));
		System.out.println(Math.min(t1, t2));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}