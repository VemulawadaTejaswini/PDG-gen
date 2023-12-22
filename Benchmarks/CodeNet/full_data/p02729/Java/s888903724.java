import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;

	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = (N * (N - 1)) / 2 + (M * (M - 1)) / 2;
		System.out.println(ans);
	}

	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
