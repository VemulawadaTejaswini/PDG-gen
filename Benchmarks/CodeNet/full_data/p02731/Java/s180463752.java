import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;

	void doIt() {
		double L = (double)sc.nextInt();
		L /= 3;
		System.out.println(L * L * L);
	}

	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
