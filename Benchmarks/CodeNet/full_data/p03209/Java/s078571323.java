import java.util.Scanner;

public class Main {

	static long level[];
	static long p[];

	public static long burger(int n, long x) {
		if(n == 0 || x <= 0)return 0;
		if (x == 1)
			return 0;

		if (1 + level[n - 1] >= x)
			return burger(n - 1, x - 1);
		else if (2 + level[n - 1] == x)
			return p[n - 1] + 1;
		else if (2 + 2 * level[n - 1] >= x)
			return 1 + p[n - 1] + burger(n - 1, x - 2 - level[n - 1]);
		else
			return 1 + 2 * p[n - 1];
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n;
		long x;
		n = sc.nextInt();
		x = sc.nextLong();

		sc.close();

		level = new long[n + 1];
		p = new long[n + 1];

		level[0] = 1;
		p[0] = 1;

		for (int i = 1; i <= n; ++i) {
			level[i] = 2 * level[i - 1] + 3;
			p[i] = 2 * p[i - 1] + 1;
		}

		long count = burger(n, x);

		System.out.println(count);

	}
}
