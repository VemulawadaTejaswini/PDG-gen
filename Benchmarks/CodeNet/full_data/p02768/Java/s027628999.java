import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int score = 0;

		for (int i = 1; i <= n; i++) {
			if (i == a || i == b) {
				continue;
			}
			score += calcNumOfCombination(n, i);
		}

		System.out.println(score);

	}

	//組み合わせの数nCrを計算
	static int calcNumOfCombination(int n, int r) {
		int num = 1;
		for (int i = 1; i <= r; i++) {
			num = num * (n - i + 1) / i;
		}
		return num;
	}
}
