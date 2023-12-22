import java.util.*;

public class Main {
	static class Info {
		int index;
		int oddCount;
		int evenCount;
		int zeroCount;
		long valueSum;
		long cost;

		public Info(int index, int oddCount, int evenCount, int zeroCount, long valueSum, long cost) {
			this.index = index;
			this.oddCount = oddCount;
			this.evenCount = evenCount;
			this.zeroCount = zeroCount;
			this.valueSum = valueSum;
			this.cost = cost;
		}

	}

	int L;
	long[] A;
	boolean[] isOdd;
	Info[] fromLeft, fromRight;

	Main() {
		Scanner in = new Scanner(System.in);
		L = Integer.parseInt(in.nextLine());
		A = new long[L];
		for (int i = 0; i < L; ++i) {
			A[i] = Long.parseLong(in.nextLine());
		}
		in.close();
		isOdd = new boolean[L];
		for (int i = 0; i < L; ++i) {
			if (A[i] % 2 != 0) {
				isOdd[i] = true;
			} else {
				isOdd[i] = false;
			}
		}
	}

	void init() {
		// fromLeftの初期化
		fromLeft = new Info[L + 1];
		int oddCount = 0;
		int evenCount = 0;
		int zeroCount = 0;
		long valueSum = 0;
		fromLeft[0] = new Info(0, 0, 0, 0, 0, 0);
		for (int i = 0; i < L; ++i) {
			if (isOdd[i]) {
				oddCount++;
			} else {
				evenCount++;
			}
			valueSum += A[i];
			long cost = 0;
			if (A[i] != 0) {
				cost = fromLeft[i].cost + (isOdd[i] ? 1 : 0);
			} else {
				cost = Math.min(2 + fromLeft[i].cost, valueSum);
				zeroCount++;
			}
			fromLeft[i + 1] = new Info(i + 1, oddCount, evenCount, zeroCount, valueSum, cost);
		}
		// fromRightの初期化
		fromRight = new Info[L + 1];
		oddCount = 0;
		evenCount = 0;
		zeroCount = 0;
		valueSum = 0;
		fromRight[L] = new Info(0, 0, 0, 0, 0, 0);
		for (int i = L - 1; i >= 0; --i) {
			if (isOdd[i]) {
				oddCount++;
			} else {
				evenCount++;
			}
			valueSum += A[i];
			long cost = 0;
			if (A[i] != 0) {
				cost = fromRight[i + 1].cost + (isOdd[i] ? 1 : 0);
			} else {
				cost = Math.min(2 + fromRight[i + 1].cost, valueSum);
				++zeroCount;
			}
			fromRight[i] = new Info(i, oddCount, evenCount, zeroCount, valueSum, cost);
		}
	}

	long calc(int start, int end) {
		long result = 0;
		// 左側
		result += fromLeft[start].cost;
		// 右側
		result += fromRight[end + 1].cost;
		// 間
		result += fromRight[start + 1].evenCount - fromRight[end + 1].evenCount;
		return result;
	}

	long calc() {
		long result = Long.MAX_VALUE;
		for (int start = 0; start < L; ++start) {
			for (int end = start; end < L; ++end) {
				long r = calc(start, end);
				result = Math.min(result, r);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.init();
		System.out.println(ins.calc());
	}

}