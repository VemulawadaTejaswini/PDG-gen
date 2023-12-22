import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long a[] = new long[n];
		long b[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = Math.abs(a[i] - x);
		}
Arrays.sort(b);
long now=b[0];
for (int i = 0; i < n; i++) {
now=gcd(now,b[i]);

}
System.out.println(now);

	}

	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}

}