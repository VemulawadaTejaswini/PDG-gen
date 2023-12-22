import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double A=1, B=1;
		while (n-->0) {
			double a = sc.nextDouble(), b = sc.nextDouble();
			double m = Math.max(Math.ceil(A/a), Math.ceil(B/b));
			A=m*a; B=m*b;
		}
		System.out.println(new DecimalFormat("#").format(A+B));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}