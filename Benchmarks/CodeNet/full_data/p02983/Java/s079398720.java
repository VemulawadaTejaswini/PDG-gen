import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		int l = sc.nextInt();
		int r = sc.nextInt();
		if(r - l < 2019) {
			int min = MAX;
			for(int i = l; i <= r; i++) {
				min = Math.min(min, i % 2019);
			}
			System.out.println(min * (min + 1));
		}
		else {
			System.out.println(1);
		}
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
