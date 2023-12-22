import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		List<Long> p = new ArrayList<Long>();
		List<Long> z = new ArrayList<Long>();
		List<Long> m = new ArrayList<Long>();

		for (int i = 0; i < N; i++) {
			long a = sc.nextLong();
			if (a > 0) { // プラスの場合
				p.add(a);
			} else if (a < 0) { // マイナスの場合
				m.add(a);
			} else { // ゼロの場合
				z.add(a);
			}
		}
		sc.close();

		// 答えが正か負かを判定
		// 積が負
		long mCnt = p.size() * m.size();
		// 積が0
		long zCnt = (z.size() * (N - z.size())) + ((z.size() * (z.size() - 1)) / 2);

		Map<Long, Integer> map = new TreeMap<Long, Integer>();

		if (K <= mCnt) {
			// 正*負をする
			for (int i = 0; i < p.size(); i++) {
				for (int j = 0; j < m.size(); j++) {
					long v = p.get(i) * m.get(j);
					if (map.containsKey(v)) {
						map.put(v, map.get(v) + 1);
					} else {
						map.put(v, 1);
					}
				}
			}
			long cnt = 0;
			for (Entry<Long, Integer> entry: map.entrySet()) {
				if (cnt == K - 1) {
					System.out.println(entry.getKey());
				}
				cnt += entry.getValue();
			}

		} else if (mCnt < K && K <= mCnt + zCnt) {
			System.out.println(0);
		} else {
			// 負*負と正*正をする
			for (int i = 0; i < p.size() - 1; i++) {
				for (int j = i + 1; j < p.size(); j++) {
					long v = p.get(i) * p.get(j);
					if (map.containsKey(v)) {
						map.put(v, map.get(v) + 1);
					} else {
						map.put(v, 1);
					}
				}
			}
			for (int i = 0; i < m.size() - 1; i++) {
				for (int j = i + 1; j < m.size(); j++) {
					long v = m.get(i) * m.get(j);
					if (map.containsKey(v)) {
						map.put(v, map.get(v) + 1);
					} else {
						map.put(v, 1);
					}
				}
			}
			long cnt = 0;
			for (Entry<Long, Integer> entry: map.entrySet()) {
				if (cnt == K - (mCnt + zCnt) - 1) {
					System.out.println(entry.getKey());
				}
				cnt += entry.getValue();
			}
		}
	}
}
