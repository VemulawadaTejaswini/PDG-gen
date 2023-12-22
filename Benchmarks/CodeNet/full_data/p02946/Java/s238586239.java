import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i < X + K; i++) {
			if (i < X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}

	}
}