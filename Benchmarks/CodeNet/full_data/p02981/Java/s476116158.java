import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] array = new int[n + 1][d + 1];

		//入力値を配列に代入
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		//i < j の場合の全ての組み合わせで距離を計算する
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++ ) {
				int norm = 0;
				for (int k = 0; k < d; k++) {
					int diff = array[i][k] - array[j][k];
					norm += diff * diff;
				}
				//整数かどうかチェックする
				boolean flag = false;
				for (int k = 0; k <= norm; k++) {
					if (k * k == norm) {
						flag = true;
					}
				}
				if (flag == true) {
					ans++;
				}
			}
		}
		System.out.println(ans);

	}
}
