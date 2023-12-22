import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int m = sc.nextInt();
		long ans = 0;

		ans = Math.abs((n - 2) * (m - 2));
		
		System.out.println(ans);

		sc.close();
	}
}
