import java.util.Scanner;

public class Main {
	private int sushiNum;
	private long counterLength;
	private long[] positions, calories, rightSum, leftSum;

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
		this.rightSum = new long[sushiNum];
		this.rightSum[0] = this.calories[0];
		for (int i = 1; i < sushiNum; ++i) {
			this.rightSum[i] = this.rightSum[i - 1] + this.calories[i];
		}
		this.leftSum = new long[sushiNum];
		this.leftSum[sushiNum - 1] = this.calories[sushiNum - 1];
		for (int i = sushiNum - 2; i >= 0; --i) {
			this.leftSum[i] = this.leftSum[i + 1] + this.calories[i];
		}
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
			// 右側にあるすしを食べたとき�?�カロリーを足�?
			result += this.rightSum[rightIndex];
			// 右側を�?復したとき�?�移動�?のカロリーを引く
			result -= positions[rightIndex] * 2L;
		}
		if (leftIndex < sushiNum) {
			// 左側にあるすしを食べたとき�?�カロリーを足�?
			result += this.leftSum[leftIndex];
			// 左側に移動したｔとき�?�移動�?のカロリーを引く
			result -= counterLength - positions[leftIndex];
		}
		return result;
	}

	public long leftFirst(int rightIndex, int leftIndex) {
		long result = 0;
		if (leftIndex < sushiNum) {
			// 左側にあるすしを食べたとき�?�カロリーを足�?
			result += this.leftSum[leftIndex];
			// 左側を�?復したとき�?�移動�?のカロリーを引く
			result -= (counterLength - positions[leftIndex]) * 2L;
		}
		if (rightIndex >= 0) {
			// 右側を移動して食べたすし�?�カロリーを足�?
			result += this.rightSum[rightIndex];
			// 右側を移動したとき�?�移動�?のカロリーを引く
			result -= positions[rightIndex];
		}
		return result;
	}
}