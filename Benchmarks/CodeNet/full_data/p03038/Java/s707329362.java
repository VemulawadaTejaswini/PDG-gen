import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 127
//D	Integer Cards
public class Main {

	static class Pair {
		int b;
		int c;
		Pair(int b, int c) {
			this.b = b;
			this.c = c;
		}
		public String toString() {
			return b + " " + c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		List<Integer> As = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			As.add(sc.nextInt());
		}
		sc.nextLine();
		List<Pair> pairs = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			pairs.add(new Pair(sc.nextInt(),sc.nextInt()));
			sc.nextLine();
		}

		sc.close();

		Collections.sort(As, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		// 前方に完全上位互換があるなら除外する
		if (pairs.size() > 1) {
			List<Pair> pairsNew = new ArrayList<>();
			for (int i = 0; i < M; i++) {
				int b = pairs.get(i).b;
				int c = pairs.get(i).c;
				boolean hasBigger = false;
				for (int j = 0; j < i; j++) {
					if (i == j) {
						continue;
					}
					int tempB = pairs.get(j).b;
					int tempC = pairs.get(j).c;
					if (b <= tempB && c <= tempC) {
						hasBigger = true;
						break;
					}
				}
				if (hasBigger) {
					continue;
				}
				pairsNew.add(new Pair(b,c));
			}
			pairs.clear();
			pairs.addAll(pairsNew);
		}

		for (Pair pair : pairs) {
			int b = pair.b;
			int c = pair.c;
			boolean isReplaced = false;
			for (int i = 0; i < N; i++) {
				if (i >= b) {
					break;
				}
				int a = As.get(i);
				if (a < c) {
					As.set(i, c);
					isReplaced  = true;
				}
			}

			if (isReplaced) {
				Collections.sort(As, new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return o1.compareTo(o2);
					}
				});
			}
		}
		long ans = 0;
		for (Integer a : As) {
			ans += a;
		}

		System.out.println(ans);

	}
}
