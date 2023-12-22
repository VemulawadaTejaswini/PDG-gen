import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	void doIt() {
		int n = sc.nextInt();
		int max = sc.nextInt();
		for(int i = 1; i < n; i++) {
			int val = sc.nextInt();
			//System.out.println(max + " " + val);
			if(max - 1 <= val) {
				max = Math.max(val, max);
			}
			else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");


	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
