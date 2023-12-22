import java.util.*;
// warm-up
// Not sure how this solution works when it was exactly what was written before.
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong(), m=sc.nextLong(), t=0;
		if (m<n) t=m/2;
		else t=n+(m-n*2)/4;
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}