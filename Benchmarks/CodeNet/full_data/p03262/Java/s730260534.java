import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int city_number = sc.nextInt();
		int start = sc.nextInt();
		if (city_number == 1) {
			System.out.println(Math.abs(sc.nextInt() - start));
			return;
		}

		for (int i = 0; i < city_number - 1; i++) {
			//System.out.println(answer);
			if (i == 0) {
				answer = gcd(Math.abs(sc.nextInt() - start), Math.abs(sc.nextInt() - start));
				continue;
			}
			answer = gcd(answer, Math.abs(sc.nextInt() - start));
		}
		System.out.println(answer);
	}

	private static int gcd(int a, int b) {
		//大小関係チェック
		if (b > a) {
			int tmp2 = 0;
			tmp2 = b;
			b = a;
			a = tmp2;
		}

		//ユークリッドの互除法
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
