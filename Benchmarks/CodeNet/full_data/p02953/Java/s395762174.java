import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	void doIt() {
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; i++) 
			h[i] = sc.nextInt();
		for(int i = 1; i < n; i++) {
			if(h[i - 1] > h[i])h[i - 1]--;
		}
		for(int i = 1; i < n; i++) {
			if(h[i - 1] > h[i]) {
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
