import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int count = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			int H = sc.nextInt();

			if (ans <= H) {
				count++;
			}
			if (H > ans) {
				ans = H;
			}
		}
		System.out.println(count);
	}
}