import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int Q = sc.nextInt();
		int a[] = new int[Q];

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}

		if (K>Q) {
			for (int i = 0; i < N; i++) {
				System.out.println("Yes");
			}
			return;
		}

		long req = Q-K + 1;

		Map<Integer, Integer> yes = new HashMap<>();

		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() >= req) {
				yes.put(e.getKey(), 1);
			}
		}

		for (int i = 1; i < N + 1; i++) {
			if (yes.containsKey(i)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}

