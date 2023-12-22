import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
			if(sum <= x) continue;
			System.out.println(i);
			return;
		}
		System.out.println(n);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
