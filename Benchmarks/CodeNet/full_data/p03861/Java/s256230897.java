import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		long ans = func(b, x) - func(a - 1, x);
		System.out.println(ans);
	}
	public static long func(long n, long x) {
		if (n == -1)
			return 0;
		return n / x + 1;
	}
}