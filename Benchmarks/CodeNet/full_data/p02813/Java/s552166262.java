//--- pC ---//
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

	int a_idx = 0;
	int b_idx = 0;
	int idx_cnt = 0;

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

		int N = Integer.parseInt(line);
		// int H = Integer.parseInt(line.split("\\s+")[0]);
		// int K = Integer.parseInt(line.split("\\s+")[1]);

		String str_a = scanner.nextLine().replaceAll("\\s+", "");
		String str_b = scanner.nextLine().replaceAll("\\s+", "");

		dfs(1, N, "", new HashSet<>(), str_a, str_b);

		System.out.println(Math.abs(a_idx - b_idx));
		return;
	}

	public void dfs(int idx, int max_n, String temp, Set<Integer> used, String str_a, String str_b) {
        if (temp.length() == max_n) {
			idx_cnt ++;
			if (temp.equals(str_a)) {
				a_idx = idx_cnt;
				// System.out.println("a = " + idx_cnt);
			}
			if (temp.equals(str_b)) {
				b_idx = idx_cnt;
				// System.out.println("b = " + idx_cnt);
			}
            return; // uncomment if subset
        }
        // if (idx == max_n+1) return;

        for (int i=1; i<=max_n; i++) { // idx->combinations, 0->permutations
            if (used.contains(i)) continue; // for permutations
			used.add(i); // for permutations
            dfs(i + 1, max_n, temp + String.valueOf(i), used, str_a, str_b);
			used.remove(i);
        }

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

// class Num implements Comparable<Num>{
// 	public int val;
//
// }
