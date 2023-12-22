import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int ans = 11;
		for (long i=1; i<=n; i++) {
			if (n % i == 0) {
				long j = n / i;
				int buf = 0;
				int a = String.valueOf(i).length();
				int b = String.valueOf(j).length();
				if (a<=b) {
					buf = b;
				} else {
					buf = a;
				}
				if (ans > buf) ans = buf;
				if (a >= b) break;
			}
		}
		System.out.println(ans);
	}

	private static int keta(long n)
	{
		return String.valueOf(n).length();
	}
}
