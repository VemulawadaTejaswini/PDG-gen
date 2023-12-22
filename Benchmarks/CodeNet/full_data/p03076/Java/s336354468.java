import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 所要時間のリスト
		int[] times = new int[5];
		input(times);

		// 0〜4の順列を生成
		List<int[]> sequences = sequence(new int[] { 0, 1, 2, 3, 4 });
//		sequences.stream().map(e -> Arrays.toString(e)).forEach(System.out::println);

		int minTime = Integer.MAX_VALUE;
		int[] order = new int[5];
		for (int[] seq : sequences) {
			for (int i = 0; i < order.length; i++) {
				order[i] = times[seq[i]];
			}
			int time = calcTime(order, minTime);
			minTime = (time < minTime) ? time : minTime;
//			System.out.printf("%s => %d\n", Arrays.toString(order), time);
		}
		System.out.println(minTime);
	}

	/**
	 * 配列で与えられた要素の順列を返す
	 * 
	 * @param members
	 * @return
	 */
	private static List<int[]> sequence(int[] members) {
		List<int[]> sequences = new ArrayList<>();
		sequence0(members, new int[members.length], 0, sequences);
		return sequences;
	}

	private static void sequence0(int[] members, int[] array, int digit, List<int[]> seq) {
		for (int m : members) {
			array[digit] = m;
			if (digit == array.length - 1) {
				seq.add(Arrays.copyOf(array, array.length));
			} else {
				sequence0(subArray(m, members), array, digit + 1, seq);
			}
		}
	}

	// memnbers の要素から m を除いた配列を返す
	private static int[] subArray(int m, int[] members) {
		int[] ret = new int[members.length - 1];
		for (int i = 0, j = 0; i < members.length; i++) {
			if (members[i] != m) {
				ret[j++] = members[i];
			}
		}
		return ret;
	}

	private static void input(int[] times) {
		try (Scanner scan = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				times[i] = scan.nextInt();
			}
		}
	}

	// order は注文する料理の所要時間配列
	private static int calcTime(int[] order, int maxTime) {
		int t = 0;
		for (int i = 0; i < order.length; i++) {
			t += order[i]; // 完成時刻
			if ((i != order.length - 1) && (t % 10 != 0)) {
				t += (10 - (t % 10));
			}
			// 最大時間を越えたらそれ以上計算しない
			if(t >= maxTime) {
				return t;
			}
		}
		return t;
	}
}
