import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long A=1, B=1;
		while (n-->0) {
			long a = sc.nextLong(), b = sc.nextLong();
          	// Precision issues due to double and ceil
			long m = Math.max((A+a-1)/a, (B+b-1)/b);
			A=m*a; B=m*b;
		}
		System.out.println(A+B);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}