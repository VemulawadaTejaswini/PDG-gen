import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
		}

		long ans = 0l;

		for (Iterator<Map.Entry<Integer, Integer>> it = hm.entrySet().iterator(); it.hasNext();) {
			Map.Entry<Integer, Integer> entry = it.next();
			int key = entry.getKey();
			int val = entry.getValue();
			if (key > val) {
				ans += (long) val;
			} else if (key < val) {
				ans += (long) val - key;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}