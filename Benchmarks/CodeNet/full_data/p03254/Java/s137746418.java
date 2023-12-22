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
		int x = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			a.add(sc.nextInt());
		}
		sc.close();

		// 計算
		Collections.sort(a);
		int i;
		for (i = 0; i < N; i++) {
			Integer integer = a.get(i);
			if (x < integer) {
				break;
			}
			if (i == N - 1 && x > integer) {
				break;
			}

			x -= integer;
		}

		// 出力
		System.out.println(i);

		return;
	}
}
