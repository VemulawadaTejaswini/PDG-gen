import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();
		sc.close();

		long max = Math.max(x, y);
		long ans = Long.MAX_VALUE;
		for (int i = 0; i <= max; i++) {
			long val = c * i * 2 + a * Math.max(x - i, 0) + b * Math.max(y - i, 0);
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
