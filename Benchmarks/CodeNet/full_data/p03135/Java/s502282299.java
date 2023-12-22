import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int t = sc.nextInt();
		int x = sc.nextInt();
		double ans;

		ans = (double) t/x;

		System.out.println(String.format("%.10f", ans));

		sc.close();
	}
}
