import java.util.*;
import java.text.DecimalFormat;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble(), x = sc.nextDouble(), t = 0, no = n;
		double[] a = new double[(int)n];
		int j = 0;
		while (no-->0) a[j++] = sc.nextDouble();
		for (int i=0; i<n-1; i++) {
          	// Adding Zero bound check for the difference which was missing in previous solution.
            // Exactly where Atcoder is awesome. CORNER CASES
			double k = Math.max(0, a[i]+a[i+1]-x);
			t+=k; a[i+1]-=k;
		}
		System.out.println(new DecimalFormat("#").format(t));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}