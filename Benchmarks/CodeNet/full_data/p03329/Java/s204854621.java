import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = n;
		for (int i = 0; i <= n; i+=9) {
			int val = 0;
			int x = i;
			int a = (int) Math.pow(9, 5);
			while (x > 0) {
				val += x / a;
				x %= a;
				a /= 9;
			}
			int y = n - i;
			int b = (int) Math.pow(6, 6);
			while (y > 0) {
				val += y / b;
				y %= b;
				b /= 6;
			}
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
