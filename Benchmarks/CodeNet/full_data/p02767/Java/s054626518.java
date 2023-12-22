import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int n1 = sc.nextInt();
		double d1 = 0.0;
		int n1list[] = new int[n1];
		for (int i = 1; i <= n1; i++) {
			int n2 = sc.nextInt();
			n1list[i - 1] = n2;
			d1 += (double) n2 / (double) n1;
		}

		// 開催場所
		int intd1 = (int) Math.round(d1);
		int score = 0;
		for (int i = 1; i <= n1; i++) {
			score += Math.pow(n1list[i - 1] - intd1, 2);
		}

		System.out.println(score);

	}
}
