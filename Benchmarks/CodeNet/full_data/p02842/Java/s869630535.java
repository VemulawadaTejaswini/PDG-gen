import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 0;

	void doIt() {
		double n = sc.nextDouble();
		for(int i = 1; i < 50000; i++) {
			int x = (int)Math.floor((double)i * 1.08);
			if(x == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(":(");
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
