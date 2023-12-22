import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ボールの数
		int[] A = new int[N]; // ボールの値
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			// 各数値の重複を数えてmapに入れる
			if (map.containsKey(A[i])) {
				int cnt = map.get(A[i]);
				map.put(A[i], cnt + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < N; i++) {
			// カウントがない場合は見ない
			if (!map.containsKey(i)) {
				continue;
			}
			// 重複を取り出す組み合わせを計算
			int c = map.get(i);
			ans += c * (c - 1) / 2;
		}

		for (int i = 0; i < N; i++) {
			// i番目を引く
			int cnt = map.get(A[i]);
			// diffを計算
			int d = cnt - 1;
			System.out.println(ans - d);
		}
	}
}
