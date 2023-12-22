import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m+1];
		int[] y = new int[m+1];
		TreeMap<Integer, Integer> a = new TreeMap<Integer, Integer>();
		Map<Integer, TreeMap<Integer, Integer>> no = new HashMap<Integer, TreeMap<Integer, Integer>>();
		int[] x = new int[m+1];

		for (int i = 1; i <= m; i++) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if (no.get(p[i]) != null) {
				a = no.get(p[i]);
				a.put(y[i], i);

			} else {
				a.clear();
				a.put(y[i], i);
			}
			no.put(p[i], a);
		}

		for (int i = 1; i <= n; i++) {
			if (no.get(i) != null) {
				int k = 1;
				for (Integer j : no.get(i).keySet()) {
					x[a.get(j)] = k;
					k++;
				}
			}
		}

		for (int i = 1; i <= m; i++) {
			System.out.println(String.format("%06d", p[i]) + String.format("%06d", x[i]));
		}

		sc.close();
	}
}
