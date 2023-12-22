//--- pB ---//
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

		// int A = Integer.parseInt(line.split("\\s+")[0]);
		// int B = Integer.parseInt(line.split("\\s+")[1]);

		String a = line.split("\\s+")[0];
		String b = line.split("\\s+")[1];

		StringBuilder str_a = new StringBuilder();
		for (int i=0; i<Integer.parseInt(b); i++) {
			str_a.append(a);
		}

		StringBuilder str_b = new StringBuilder();
		for (int i=0; i<Integer.parseInt(a); i++) {
			str_b.append(b);
		}

		int res = str_a.toString().compareTo(str_b.toString());
		if (res < 0) {
			System.out.println(str_a);
		} else {
			System.out.println(str_b);
		}
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
