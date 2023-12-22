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
					ignore = ignore + read;
					ignoreCnt++;
				}
				sum = sum + read;
			}

			if (sum < K) {
				System.out.println(N);
				return;
			}

			int result = 0;
			int tmp = sum - ignore;
			Collections.sort(alist);

			for (int i = 0; i < N - ignoreCnt; i++) {
				tmp = tmp - alist.get(i);
				if (tmp >= K) {
					result++;
				} else {
					break;
				}
			}
			System.out.println(result);

		}
	}
}