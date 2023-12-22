import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	private static final void solve() {
		try (Scanner cin = new Scanner(System.in)) {

			int N = cin.nextInt();
			int M = cin.nextInt();
			int[] b = new int[M];

			List<Integer> a2 = new ArrayList<>(M);

			int a_;
			int b_;
			int index = 0;

			for (int i = 0; i < M; i++) {
				a_ = cin.nextInt();
				b_ = cin.nextInt();
				if (a_ == 1) {
					b[index] = b_;
					index++;
				} else if (b_ == N) {
					a2.add(a_);
				}
			}

			for (int i = 0; i < index; i++) {
				b_ = b[i];
				if (a2.contains(b_)) {
					System.out.println("POSSIBLE");
					return;
				}
			}

			System.out.println("IMPOSSIBLE");

		} finally {
		}
	}
}
