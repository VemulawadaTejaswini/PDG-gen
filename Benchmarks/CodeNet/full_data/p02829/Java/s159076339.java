import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(6 - a - b);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
