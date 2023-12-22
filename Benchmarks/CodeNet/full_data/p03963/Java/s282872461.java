import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double k = sc.nextDouble(), t = k;
		for (int i=1; i<n; i++) {
			t*=k-1; // Good catch NICE problem
			if (t>Integer.MAX_VALUE) break;
		}
		System.out.println(new Double(t).intValue());
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}