import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//AtCoder Beginner Contest 155
//D	Pairs
public class Main84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(sc.next());
		}
		sc.close();

		Map<Long, Integer> countMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				long v = A[i] * A[j];
				if (countMap.containsKey(v)) {
					countMap.put(v, countMap.get(v).intValue() + 1);
				} else {
					countMap.put(v, 1);
				}
			}
		}

		List<Long> l = new ArrayList<>(countMap.keySet());
		Collections.sort(l);

		for (Long v : l) {
			K -= countMap.get(v);
			if (K <= 0) {
				System.out.println(v);
				break;
			}
		}
	}
}
