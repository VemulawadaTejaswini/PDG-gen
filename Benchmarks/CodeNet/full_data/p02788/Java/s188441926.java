//--- pF ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();

		int N = Integer.parseInt(line.split("\\s+")[0]);
		int D = Integer.parseInt(line.split("\\s+")[1]);
		int A = Integer.parseInt(line.split("\\s+")[2]);

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i=0; i<N; i++) {
			line = scanner.nextLine();
			int X = Integer.parseInt(line.split("\\s+")[0]);
			int H = Integer.parseInt(line.split("\\s+")[1]);
			map.put(X, H);
		}

		long res = 0;
		for (;map.keySet().size() != 0;) {
			int cur = map.firstKey();
			int H = map.get(cur);
			int times = (int)Math.ceil(1.0 * H / A);
			int damage = A * times;

			// System.out.println("cur = " + cur + ", times = " + times);

			for (Integer t = cur; t != null && t <= cur + D*2;) {
				map.put(t, map.get(t) - damage);
				if (map.get(t) <= 0) map.remove(t);

				t = map.ceilingKey(t);
			}

			res += times;
		}

		System.out.println(res);

		return;
	}

	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}
}

// f(x) = 2 * f( floor(x/2) ) + 1;
// f(1) = 1;
