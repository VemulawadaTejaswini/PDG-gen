import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		TreeMap<String, Integer> a = new TreeMap<String, Integer>();
		TreeMap<Integer, Integer> b = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		String pre = "";

		for (int i = 1; i <= n; i++) {
			String str = sc.next() + String.valueOf(i);
			int z = sc.nextInt();
			a.put(str, z);
			// System.out.println(str + " " + z + " " + i);
		}

		pre = a.firstKey().substring(0, a.firstKey().length() - 1);
		
		for (String x : a.keySet()) {
			// System.out.print(pre + " ");
			if (!pre.equals("") && x.startsWith(pre)) {
				b.put(a.get(x), Integer.valueOf(x.substring(x.length() - 1, x.length())));
				// System.out.print(a.get(x) + " ");
			} else {
				pre = x.substring(0, x.length() - 1);
				if (b.size() == 0) {
					b = new TreeMap<Integer, Integer>(Collections.reverseOrder());
					b.put(a.get(x), Integer.valueOf(x.substring(x.length() - 1, x.length())));
					// System.out.println(a.get(x) + " ");
				} else {
					for (Integer y : b.navigableKeySet()) {
						System.out.println(b.get(y));
					}
					b.clear();
					b.put(a.get(x), Integer.valueOf(x.substring(x.length() - 1, x.length())));
					// System.out.println(a.get(x) + " ");
				}
			}
		}

		for (Integer y : b.navigableKeySet()) {
			System.out.println(b.get(y));
		}
		sc.close();
	}
}