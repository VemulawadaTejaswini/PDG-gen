import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示

		int N = sc.nextInt();
		int h[] = new int[N];

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		int ans = 0;
		int count = 0;
 	
		for (int i = 0; i < N - 1; i++) {
			if (h[i] >= h[i + 1]) {
				count++;
			} else {
				count = 0;
			}
			if (ans < count) {
				ans = count;
			}
		}
		System.out.println(ans);
	}
}