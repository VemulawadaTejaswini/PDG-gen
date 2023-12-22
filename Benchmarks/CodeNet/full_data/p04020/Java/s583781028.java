import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int ans = 0;
		int a = 0;
		a = scanner.nextInt();
		for (int i = 0; i < N - 1; i++) {
			a = a + scanner.nextInt();
			ans = ans + (int) Math.floor(a / 2);
			if (a == 1) {
				a = 0;
			}
			a = a % 2;
		}
		System.out.println(ans);
	}
}