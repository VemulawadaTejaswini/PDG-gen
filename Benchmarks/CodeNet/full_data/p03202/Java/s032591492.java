import java.util.*;

public class Main {
	int N;
	List<Long> A;
	Map<Long, Integer> counts = new HashMap<>();
	List<Long> countKeys;
	long result;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = new ArrayList<>(N);
		long v = in.nextLong();
		A.add(v);
		long prev = v;
		for (int i = 1; i < N; ++i) {
			v = in.nextLong();
			A.add(v);

			if (v <= prev) {
				// countsのインクリメント
				if (!counts.containsKey(v)) {
					counts.put(v, 1);
				} else {
					counts.put(v, counts.get(v) + 1);
				}
			}
			prev = v;
		}
		in.close();
		// keyリストをとる
		this.countKeys = new ArrayList<>(this.counts.size());
		this.countKeys.addAll(this.counts.keySet());
		Collections.sort(this.countKeys);
	}

	void calc() {
		this.result = 1L;
		// char数を1ずつ増やし，条件を満たすところで打ち切る
		if (this.countKeys.isEmpty()) {
			// char数が1で十分
			return;
		} else {
			while (true) {
				this.result++;
				// System.out.println("try: " + this.result);
				if (isEnable(this.result)) {
					return;
				}
			}
		}
	}

	boolean isEnable(long charNum) {
		long sum = 0;
		boolean result = true;
		for (Long key : this.countKeys) {
			sum += (long) (this.counts.get(key) + 1);
			// sum: 現状の満たさなければいけないパターン数
			// key: 現状の桁数
			// charNum ^ key <= sumであればOK
			long maxPattern = (long)(Math.pow(charNum, key));
			// System.out.println("maxPattern: " + maxPattern + ", sum: " + sum + ", key: " + key);
			if (maxPattern < sum) {
				result =  false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println((ins.result));
	}

}