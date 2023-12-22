import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x[] = new long[n + 1];

		x[0] = 2;
		x[1] = 1;
		long ans = 0;
		for (int i = 2; i <= n; i++) {
			ans =  x[i - 1] + x[i - 2];
			x[i] = ans;
		}

		System.out.println(ans);

		sc.close();
	}

}
