import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
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
		// 積が正
		// long pCnt = (p.size() * (p.size() - 1) / 2) + (m.size() * (m.size() - 1) / 2);

		List<Long> list = new ArrayList<Long>();

		if (K <= mCnt) {
			// 正*負をする
			for (int i = 0; i < p.size(); i++) {
				for (int j = 0; j < m.size(); j++) {
					list.add(p.get(i) * m.get(j));
				}
			}
			Collections.sort(list);
			System.out.println(list.get(K - 1));

		} else if (mCnt < K && K <= mCnt + zCnt) {
			System.out.println(0);
		} else {
			// 負*負と正*正をする
			for (int i = 0; i < p.size() - 1; i++) {
				for (int j = i + 1; j < p.size(); j++) {
					list.add(p.get(i) * p.get(j));
				}
			}
			for (int i = 0; i < m.size() - 1; i++) {
				for (int j = i + 1; j < m.size(); j++) {
					list.add(m.get(i) * m.get(j));
				}
			}
			Collections.sort(list);
			System.out.println(list.get((int) (K - (mCnt + zCnt) - 1)));
		}
	}
}
