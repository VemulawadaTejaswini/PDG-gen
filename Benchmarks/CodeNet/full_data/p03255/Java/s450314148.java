import java.math.BigDecimal;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		long X = Long.parseLong(tokens[1]);
		PriorityQueue<Long> x = new PriorityQueue<>(N, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			x.add(Long.parseLong(tokens[i]));
		}
		long[] moveCost = new long[N];
		moveCost[0] = 4;
		if (N >= 2) {
			moveCost[1] = 5;
		}
		for (int i = 2; i < N; ++i) {
			moveCost[i] = moveCost[i - 1] + 2;
		}
		BigDecimal cost = new BigDecimal(0);
		while (!x.isEmpty()) {
			int currentCarry = 1;
			long firstDust = x.poll();
			cost = cost.add(new BigDecimal(firstDust + X + firstDust * moveCost[currentCarry - 1] + X));

			// 足すかどうかの判断
			for (int i = x.size() - 1; i >= 0; --i) {
				long dust = x.peek();
				if (dust * moveCost[currentCarry] <= dust + moveCost[0] * dust + X) {
					// 左辺: 今拾っていくコスト == 拾う位置 * 1つ増えたときの移動コスト
					// 右辺: 拾っていかない場合の回収コスト == 拾う位置まで戻ってくる + 1つ抱えた状態の移動コスト * 拾う位置 + 捨てるコスト
					cost = cost.add(new BigDecimal(dust * moveCost[currentCarry] + X));
					currentCarry++;
					x.poll();
				} else {
					break;
				}
			}
		}
		System.out.println(cost);

		in.close();
	}
}