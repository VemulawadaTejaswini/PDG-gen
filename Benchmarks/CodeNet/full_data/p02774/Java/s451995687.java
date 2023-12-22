import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//AtCoder Beginner Contest 155
//D	Pairs
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(sc.next());
		}
		sc.close();

		Map<Long, Integer> countMap_p = new HashMap<>();
		Map<Long, Integer> countMap_m = new HashMap<>();
		long minus_c = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				long v = A[i] * A[j];
				if (v >= 0) {
					if (countMap_p.containsKey(v)) {
						countMap_p.put(v, countMap_p.get(v).intValue() + 1);
					} else {
						countMap_p.put(v, 1);
					}
				} else {
					minus_c++;
					if (countMap_m.containsKey(v)) {
						countMap_m.put(v, countMap_m.get(v).intValue() + 1);
					} else {
						countMap_m.put(v, 1);
					}
				}
			}
		}


		if (K < minus_c) {
			List<Long> l = new ArrayList<>(countMap_m.keySet());
			Collections.sort(l);
			for (Long v : l) {
				K -= countMap_m.get(v);
				if (K <= 0) {
					System.out.println(v);
					break;
				}
			}
		} else {
			List<Long> l = new ArrayList<>(countMap_p.keySet());
			Collections.sort(l);
			K -= minus_c;
			for (Long v : l) {
				K -= countMap_p.get(v);
				if (K <= 0) {
					System.out.println(v);
					break;
				}
			}
		}

	}
}
