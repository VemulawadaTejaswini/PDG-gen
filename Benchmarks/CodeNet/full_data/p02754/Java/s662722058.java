import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long cnt = 0l;
		cnt += (N / (A + B)) * A;
		cnt += Math.min((N % (A + B)), A);
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
