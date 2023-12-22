import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			List<Integer> alist = new ArrayList<Integer>();
			int sum = 0;
			int ignore = 0;
			int ignoreCnt = 0;

			for (int i = 0; i < N; i++) {
				int read = sc.nextInt();
				if (read < K) {
					alist.add(read);
				} else {
					// 単独でKを超えるものは除外
					ignore = ignore + read;
					ignoreCnt++;
				}
				sum = sum + read;
			}

			// 全値の合計がKより低い場合はすべて不要
			if (sum < K) {
				System.out.println(N);
				return;
			}

			int result = 0;
			Collections.sort(alist);
			Collections.reverse(alist);

			for (int i = 0; i < N - ignoreCnt; i++) {
				int tmp = alist.get(i);
				for (int j = i + 1; j < N - ignoreCnt - i; j++) {
					tmp = tmp + alist.get(j);
					if (tmp >= K) {
						result = result + (N - ignoreCnt - (i + 1) - j);
						break;
					}
				}
			}
			System.out.println(result);

		}
	}
}