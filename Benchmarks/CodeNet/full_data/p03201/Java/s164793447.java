import java.util.*;

public class Main {
	int N;
	List<Long> A;
	Map<Long, Integer> counts; // 出現数のカウント
	List<Long> keys; // 出現する値自体のリスト
	Map<Long, Long> remainVals;
	long result = 0L;

	Main() {
		Scanner in = new Scanner(System.in);
		this.N = in.nextInt();
		this.A = new ArrayList<>(N);
		this.counts = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			long value = in.nextLong();
			this.A.add(value);
			if (!counts.containsKey(value)) {
				counts.put(value, 1);
			} else {
				counts.put(value, counts.get(value) + 1);
			}
		}
		in.close();
		// 出現する値の集合をとる
		this.keys = new ArrayList<>(counts.size());
		this.keys.addAll(this.counts.keySet());
		Collections.sort(this.keys);
		// 出現する値の2のべき乗への残り値を算出する
		this.remainVals = new HashMap<>();
		long exps = 1L;
		for (int i = 0; i < keys.size(); ++i) {
			long key = keys.get(i);
			if (key < exps) {
				this.remainVals.put(key, exps - key);
			} else if (key == exps) {
				this.remainVals.put(key, 0L);
			} else {
				// expsを更新して，上記2つと同じ処理を行う
				exps = updateExps(exps, key);
				if (key < exps) {
					this.remainVals.put(key, exps - key);
				} else {
					// updateした結果べき乗と一致したパターンのはず
					this.remainVals.put(key, 0L);
				}
			}
		}
	}

	long updateExps(long baseExps, long val) {
		long result = baseExps;
		while (result < val) {
			result *= 2L;
		}
		return result;
	}

	void calc() {
		for (int i = this.keys.size() - 1; i >= 0; --i) {
			long key = keys.get(i);
			int keyRemainNum = this.counts.get(key);
			if (keyRemainNum <= 0) {
				// なにもしない
				continue;
			}
			long remainVal = remainVals.get(key);
			if (remainVal == 0L) {
				// 同じもの同士で合わせるしかない
				int count = this.counts.get(key);
				int addNum = Math.floorDiv(count, 2);
				this.result += (long) addNum;
				this.counts.put(key, count - (addNum * 2));
			} else {
				if (!this.counts.containsKey(remainVal)) {
					// ついとなるのが存在しない
					continue;
				} else {
					int count = this.counts.get(key);
					int remainValCount = this.counts.get(remainVal);
					int addNum = Math.min(count, remainValCount);
					this.result += (long) addNum;
					this.counts.put(key, this.counts.get(key) - addNum);
					this.counts.put(remainVal, this.counts.get(remainVal) - addNum);
				}
			}
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}

}