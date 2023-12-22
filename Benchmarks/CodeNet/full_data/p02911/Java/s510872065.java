import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//参加者
		int N = sc.nextInt();
		//スタート時点のポイント
		int K = sc.nextInt();
		//正解の回数
		int Q = sc.nextInt();
		//ラウンド終了時の最小点数
		int n = K - Q;

		int[] array = new int[Q];
		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 1; index <= N; index++) {
			//昇順と持ち点
			map.put(index, n);
		}

		for (int index = 0; index < Q; index++) {
			//正解者
			int A = sc.nextInt();
			//正解者の順番
			array[index] = A;
			for (Integer key : map.keySet()) {
				if (key - 1 == array[index]) {
					int h = map.get(key) + 1;
					map.replace(key, h);
				}
			}
		}

		for (Integer val : map.values()) {
			if (0 >= val) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}
}