import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final String[] result = {"War", "No War"};
		Main dwt = new Main();
		if(dwt.Dimensional_World_Tale()) {
			System.out.println(result[1]);
		}else {
			System.out.println(result[0]);
		}
	}

	public boolean Dimensional_World_Tale() {
		/**
		 * <条件>
		 * X,Yの示す範囲 が x[],y[] の被っていない範囲 に含まれていればよい
		 *
		 */

		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] array_x = new int[n];
		int[] array_y = new int[m];
		for(int i = 0; i < n; i++) {
			array_x[i] = sc.nextInt();
		}
		for(int t = 0; t < m; t++) {
			array_y[t] = sc.nextInt();
		}

		/*
		 * x[]とy[]の被らない範囲を探索
		 * 昇順にソート→最小値と最大値を比べる
		 */
		Arrays.sort(array_x);
		Arrays.sort(array_y);
		int min = array_x[n-1];
		int max = array_y[0];

		/*
		 * XとYの範囲を比較
		 */
		if(min > x && max <= y) {
			if(min < max) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
 	}
}
