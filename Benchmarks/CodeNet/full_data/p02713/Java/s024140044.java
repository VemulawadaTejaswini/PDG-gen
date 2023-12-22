import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				for (int h = 1; h <= K; h++) {

					sum += gcd(i, gcd(j, h));
				}
			}
		}
		System.out.println(sum);

	}

	public static int gcd(int p, int q) {

		if (p % q == 0) {
			return q;
		}
		return gcd(q, p % q);
	}
}