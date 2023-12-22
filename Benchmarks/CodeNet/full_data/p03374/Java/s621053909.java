import java.util.Scanner;

public class Main {
	private int sushiNum;
	private long counterLength;
	private long[] positions, calories;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int sushiNum = Integer.parseInt(tokens[0]);
		long counterLength = Long.parseLong(tokens[1]);
		long[] positions = new long[sushiNum];
		long[] calories = new long[sushiNum];
		for (int i = 0; i < sushiNum; ++i) {
			tokens = in.nextLine().split(" ");
			positions[i] = Long.parseLong(tokens[0]);
			calories[i] = Long.parseLong(tokens[1]);
		}
		Main main = new Main(sushiNum, counterLength, positions, calories);
		System.out.println(main.solve());
		in.close();
	}

	public Main(int sushiNum, long counterLength, long[] positions, long[] calories) {
		this.sushiNum = sushiNum;
		this.counterLength = counterLength;
		this.positions = positions;
		this.calories = calories;
	}

	public long solve() {
		long result = 0L;

		for (int rightIndex = -1; rightIndex < sushiNum; ++rightIndex) {
			for (int leftIndex = rightIndex + 1; leftIndex <= sushiNum; ++leftIndex) {
				result = Math.max(result, rightFirst(rightIndex, leftIndex));
				result = Math.max(result, leftFirst(rightIndex, leftIndex));
			}
		}
		return result;
	}

	public long rightFirst(int rightIndex, int leftIndex) {
		long result = 0;
		if (rightIndex >= 0) {
			// 右側にあるすしを食べたときのカロリーを足す
			for (int i = 0; i <= rightIndex; ++i) {
				result += calories[i];
			}
			// 右側を往復したときの移動分のカロリーを引く
			result -= positions[rightIndex] * 2L;
		}
		if (leftIndex < sushiNum) {
			// 左側にあるすしを食べたときのカロリーを足す
			for (int i = sushiNum - 1; i >= leftIndex; --i) {
				result += calories[i];
			}
			// 左側に移動したｔときの移動分のカロリーを引く
			result -= counterLength - positions[leftIndex];
		}
		return result;
	}

	public long leftFirst(int rightIndex, int leftIndex) {
		long result = 0;
		if (leftIndex < sushiNum) {
			// 左側にあるすしを食べたときのカロリーを足す
			for (int i = sushiNum - 1; i >= leftIndex; --i) {
				result += calories[i];
			}
			// 左側を往復したときの移動分のカロリーを引く
			result -= (counterLength - positions[leftIndex]) * 2L;
		}
		if (rightIndex >= 0) {
			// 右側を移動して食べたすしのカロリーを足す
			for (int i = 0; i <= rightIndex; ++i) {
				result += calories[i];
			}
			// 右側を移動したときの移動分のカロリーを引く
			result -= positions[rightIndex];
		}
		return result;
	}
}