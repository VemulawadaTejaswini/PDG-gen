import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int ans = 0;
		int a = 0, b = 0;
		a = scanner.nextInt();
		for (int i = 0; i < N - 1; i++) {
			b = scanner.nextInt();
			while (a + b > 1) {
				if (a > 1) {
					a = a - 2;
					ans++;
				} else if (a == 1) {
					a--;
					b--;
					ans++;
				} else {
					b = b - 2;
					ans++;
				}
			}
			a = b;
		}
		System.out.println(ans);
	}
}