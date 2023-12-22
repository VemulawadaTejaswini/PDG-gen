import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Deque<Integer>> list = new ArrayList<>();
		for (int j = 0; j < N; j++) {
			Deque<Integer> q = new LinkedList<Integer>();
			for (int i = 0; i < N - 1; i++) {
				q.add(sc.nextInt());
			}
			list.add(q);
		}
		// list.forEach(q -> {
		// System.out.println(1);
		// q.forEach(System.out::println);
		// });
		int ans = 0;
		int max = N * (N - 1) / 2;
		int flg = 1;
		int[] diff = new int[N];
		int count = 0;
		while (flg == 1) {
			for (int i = 0; i < N; i++) {
				if (list.get(i).peek() == null) {
					flg = 0;
					continue;
				}
				int opo = list.get(i).peek() - 1;
				if (list.get(opo).peek() == i + 1) {
					diff[i]++;
					diff[opo]++;
					System.out.println(list.get(i).peek());
					System.out.println(list.get(opo).peek());
					list.get(i).poll();
					list.get(opo).poll();
					flg = 1;
				}
			}
			int diffMax = 0;
			for (int i = 0; i < N; i++) {
				if (diff[i] != 0) {
					break;
				}
				if (i == N - 1) {
					flg = 0;
				}
			}
			for (int i = 0; i < N; i++) {
				if (diffMax < diff[i]) {
					diffMax = diff[i];
				}
			}
			ans += diffMax;
			for (int i = 0; i < N; i++) {
				diff[i] = 0;
			}
		}

		if (ans > max || ans == 0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		System.out.println(ans);
		sc.close();

	}
}
