import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			int a = i;
			int b = n - i;
			int sum = 0;
			while (a > 0) {
				sum += a % 10;
				a /= 10;
			}
			while (b > 0) {
				sum += b % 10;
				b /= 10;
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}