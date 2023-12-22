import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		int ans = Integer.MAX_VALUE;
		int end = Math.max(x, y) * 2;
		for (int i = 0; i <= end; i++) {
			int val = c * i * 2 + a * Math.max((x - i), 0) + b * Math.max((y - i), 0);
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}
}
