import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static int N = 0;
	private static int M = 0;
	private static int[][] AB;
	private static Boolean[] flagArray;
	private static int count = 0;
	private static String direction = "";

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			N = Integer.parseInt(sc.next());
			M = Integer.parseInt(sc.next());
			sc.nextLine();
			// 無向なので2倍用意
			AB = new int[M * 2][2];
			// １オリジン
			flagArray = new Boolean[N + 1];
			Arrays.fill(flagArray, 1, flagArray.length, false);
			// １オリジンのため0は探索済みにしておく
			flagArray[0] = true;

			for (int i = 0; i < M * 2; i = i + 2) {
				int from = Integer.parseInt(sc.next());
				int to = Integer.parseInt(sc.next());
				//sc.nextLine();
				// 双方向分用意
				AB[i][0] = from;
				AB[i][1] = to;
				AB[i + 1][0] = to;
				AB[i + 1][1] = from;

			}
		}
		exe(1);
		System.out.println(count);
	}

	private static void exe(int now) {
		// nowは探索済み
		flagArray[now] = true;
		direction += String.valueOf(now);

		// 全て探索済みか？
		if (!Arrays.asList(flagArray).contains(false)) {
			count++;
			// Debug
			//System.out.println(direction);
			// 戻るのでnowを未探索に戻す
			flagArray[now] = false;
			direction = direction.substring(0, direction.length() - 1);
			return;
		}

		for (int i = 0; i < AB.length; i++) {
			// from値がnowでto値が探索済みでない
			if (AB[i][0] == now && !flagArray[AB[i][1]]) {
				// toへ飛ぶ
				exe(AB[i][1]);
			}
		}

		// 戻るのでnowを未探索に戻す
		flagArray[now] = false;
		direction = direction.substring(0, direction.length() - 1);
	}
}