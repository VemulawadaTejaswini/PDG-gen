import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int a = m / n;
		int ans = 1;
		for (int i = 2; i <= a; i++) {
			if (m % i == 0) {
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
