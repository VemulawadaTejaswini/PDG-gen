import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		long ans = 0;

		if (n % 2 == 0) {
			ans = n;
		} else {
			ans = 2 * n;
		}
		
		System.out.println(ans);

		sc.close();
	}
}
