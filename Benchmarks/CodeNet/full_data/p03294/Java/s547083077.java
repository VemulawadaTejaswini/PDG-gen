import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}
	
	private void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] a = new int[N];
		int gcd = 1;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			gcd = calcGcd(gcd, a[i]);
		}
		
		long lcm = 1;
		for (int i = 0; i < N; i++) {
			lcm *= a[i]/gcd;
		}
		final long m = lcm -1;
		int f = 0;
		for (int i = 0; i < N; i++) {
			f += m % a[i];
		}
		System.out.println(f);
		sc.close();

	}
	
	private int calcGcd (int a, int b) {
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (a % b == 0) {
			return b;
		}
		else {
			return calcGcd(b, a%b);
		}
	}
}
