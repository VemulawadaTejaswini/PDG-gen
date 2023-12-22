import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();

		ArrayList<Integer> X = new ArrayList<>();
		ArrayList<Integer> s = new ArrayList<>();

		for (int n = 0; n < N; n++) {
			X.add(sc.nextInt());
		}

		// 最後の全消しの位置を求める
		int now = 0;
		int last = 0;
		for (int i = 0; i < N * K; i++) {
			if (X.get(now) == X.get(i % N)) {
				last = i;
				i++;
				now = X.get(i % N);
			}
		}

		for (int i = last; i < N * K; i++) {
			if (s.isEmpty()) { // sが空なら追加
				s.add(X.get(i % N));
			} else if (s.get(0) == X.get(i % N)) { // sの先頭が一致したら全要素削除
				s.clear();
			} else if (s.contains(X.get(i % N))) { // sが要素を含むあいだ、末尾から削除しつづける
				while (s.contains(X.get(i % N))) {
					s.remove(s.size() - 1);
				}
			} else {
				s.add(X.get(i % N));
			}
		}

		// 出力
		for (

				int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i));
			System.out.print(i == s.size() - 1 ? "\n" : " ");
		}
	}
}