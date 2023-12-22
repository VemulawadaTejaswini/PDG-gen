import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());
		long m = Long.parseLong(sc.next());

		long ans = Math.min(n, m / 2);
		m -= ans * 2;
		ans += Math.max(0, m / 4);

		System.out.println(ans);
		sc.close();
	}
}