import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		System.out.println((sc.nextInt() * 500 >= sc.nextInt())?"Yes":"No");
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
