import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

		long a = n % k;
		long ans = Math.min(a, k - a);
		System.out.println(ans);
	}
}
