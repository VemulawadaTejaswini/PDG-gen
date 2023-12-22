import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int d[] = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
			sum += d[i];
		}
		int ans = 0;
		for(int i = 0; i < n; i++){
			sum -= d[i];
			ans += d[i] * sum;
		}
		System.out.println(ans);
	}
		
	
	

	public static void main(String[] args) {
		new Main().doIt();
	}
}
