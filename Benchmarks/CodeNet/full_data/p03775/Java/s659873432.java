import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int ans = 11;
		int buf = 0;
		long j = 0;
		for (long i=1; i<=n/2+1; i++) {
			if (n % i == 0) {
				j = n / i;
				int a = String.valueOf(i).length();
				int b = String.valueOf(j).length();
				if (a > b) break;
				if (ans > b) ans = b;
				if (a == b) break;
			}
		}
		System.out.println(ans);
	}
}
