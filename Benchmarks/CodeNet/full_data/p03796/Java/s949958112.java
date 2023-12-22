import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		long ans = N % 1000000007;

		for (int i = N-1; i > 0; i--) {
			ans = ans*i%1000000007;

		}
		System.out.println(ans);
		sc.close();
	}
}
