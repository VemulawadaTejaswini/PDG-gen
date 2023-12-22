import java.util.*;

public class Main {
	int N;
	List<Integer> A;
	int maxA = -1;
	int[] maxChars;
	int result = -1;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			int v = in.nextInt();
			A.add(v);
			maxA = Math.max(maxA, v);
		}
		in.close();
		this.maxChars = new int[maxA];
		Arrays.fill(this.maxChars, 0);
	}

	void calc() {
		int current = A.get(0);
		for (int i = 1; i < A.size(); ++i) {
			int next = A.get(i);
			if (current < next) {
				// 無条件で辞書順成立
			} else if (current == next) {
				// current
				int addIndex = getNextState(maxChars, current);
				this.maxChars[addIndex]++;
			} else {
				// current < next
				int addIndex = getNextState(maxChars, current);
				this.maxChars[addIndex]++;
			}
			current = next;
		}
		for (int i = 0; i < this.maxChars.length; ++i) {
			result = Math.max(result, this.maxChars[i]);
		}
	}

	void showIndex(int to) {
		for (int i = 0; i < to; ++i) {
			System.out.print(this.maxChars[i] + " ");
		}
		System.out.println("");
	}

	int getNextState(int[] currentState, int to) {
		if (to == 1) {
			// 値をインクリメントするしかない
			return 0;
		} else {
			int lastVal = currentState[to - 1];
			int index = -1;
			for (int i = to - 2; i >= 0; --i) {
				if (lastVal > currentState[i]) {
					index = i;
					break;
				}
			}
			if (index < 0) {
				return to - 1;
			} else {
				return index;
			}
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println((ins.result + 1));
	}

}