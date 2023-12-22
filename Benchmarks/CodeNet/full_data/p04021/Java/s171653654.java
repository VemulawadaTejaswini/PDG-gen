import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			a[i] = k;
			map.put(k, i);
		}
		int[] b = new int[n];
		int id = 0;
		for (Integer value : map.keySet()) {
			b[map.get(value)] = id++;
		}

		int sum = 0;
		for (int i = 0; i < n; i += 2) {
			if (b[i] % 2 == 1) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
