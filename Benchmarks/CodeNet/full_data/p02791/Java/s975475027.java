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
	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		scanner.nextLine();
		String line = scanner.nextLine();


		// int H = Integer.parseInt(line.split("\\s+")[0]);
		// int K = Integer.parseInt(line.split("\\s+")[1]);

		int[] arr = strToIntArray(line);

		int res = 0;

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int u : arr) {
			map.put(u, 1);
			if (map.lowerKey(u) == null) res ++;	
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

// class Num implements Comparable<Num>{
// 	public int val;
//
// }
