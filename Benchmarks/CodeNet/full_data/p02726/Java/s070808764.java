import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		int[] ans = new int[N - 1];
		for (int i = 1; i <= N - 1; i++) { // 始点
			for (int j = i + 1; j <= N; j++) { // 終点
				// 短縮されているかどうかをフラグに持つ
				boolean flg = false;
				if (i <= X && Y <= j) {
					flg = true;
				}

				if (flg) {
					ans[j - i - 2]++;
				} else {
					ans[j - i - 1]++;
				}
			}
		}

		for (int i = 0; i < N - 1; i++) {
			System.out.println(ans[i]);
		}
	}
}
