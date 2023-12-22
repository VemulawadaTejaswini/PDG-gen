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
		int L = sc.nextInt();
		List<String> S = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			S.add(sc.next());
		}
		sc.close();

		// 計算
		Collections.sort(S);
		StringBuffer sb = new StringBuffer(N * L + 1);
		for (String string : S) {
			sb.append(string);
		}

		// 出力
		System.out.println(sb.toString());

		return;
	}
}
