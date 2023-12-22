import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int X = sc.nextInt();
		int Y = sc.nextInt();
		long ans = -1;
		long max = (long) Math.pow(10, 18);

		if ((X >= Y) && (X % Y == 0)) {
		} else {
			for (long i = 1; i <= max / X; i++) {
				if ((X * i) % Y != 0) {
					ans = X * i;
					break;
				}
			}
		}
		// 出力
		System.out.println(ans);
	}
}
