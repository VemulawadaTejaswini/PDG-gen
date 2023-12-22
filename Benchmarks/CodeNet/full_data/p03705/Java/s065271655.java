import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long ans = 0;
		if (a > b) {
		} else if (n == 1) {
			if (a == b) {
				ans = 1;
			}
		} else if (n == 2) {
			if (a <= b) {
				ans = 1;
			}
		} else {
			ans = b * (n - 2) - a * (n - 2) + 1;
		}
		System.out.println(ans);

	}
}
