import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;

	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n + 1];
		int b = 1;
		double pb = 0;
		for(int i = n; i >= 1; i--) {
			while(i * b < k) {
				b *= 2;
			}
			pb += (double)1 / b;
		}
		System.out.println(pb / n);
	}
	

	public static void main(String[] args) {
		new Main().doIt();
	}
}
