import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[5];
		long total = 0;

		for (int i = 0; i < n; i++) {
			char s = sc.next().charAt(0);
			switch (s) {
				case 'M':
				a[0]++;
				total++;
				break;
				case 'A':
				a[1]++;
				total++;
				break;
				case 'R':
				a[2]++;
				total++;
				break;
				case 'C':
				a[3]++;
				total++;
				break;
				case 'H':
				a[4]++;
				total++;
				break;
			}
		}

		if (total < 3) {
			System.out.println("0");
			return;
		}

		long x = combination(total, 3);
		long y = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] > 1) {
				y += combination(a[i], 2) * total - a[i];
			}
		}

		System.out.println(x - y);
	}

	private static long factorial(long x) {
		long f = 1;
		while(x > 0) {
			f *= x;
			x -= 1;
		}
		return f;
	}

	private static long combination(long n, long r) {
		return factorial(n) / (factorial(n - r) * factorial(r));
	}
}
