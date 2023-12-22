import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long i = a;
		long ans = a;

		while (++i <= b) {
			ans ^= i;
		}

		System.out.println(ans);
		sc.close();
	}
}
