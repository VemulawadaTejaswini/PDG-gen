import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> lengthList = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			lengthList.add(sc.nextInt());
		}
		sc.close();

		// 計算
		Collections.sort(lengthList, Collections.reverseOrder());
		int sumLength = 0;
		for (int i = 0; i < K; i++) {
			sumLength += lengthList.get(i);
		}

		// 出力
		System.out.println(sumLength);

		return;
	}
}
