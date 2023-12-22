//--- pE ---//
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
	int inf = (int)1e9;
	int mod = (int)1e9 + 7;

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
		// int N = Integer.parseInt(line.split("\\s+")[1]);

		int[] A = strToIntArray(scanner.nextLine());

		long L = 1;
		for (int u : A) {
			long t = lcm(L, u);
		}

		long res = 0;
		for (int u : A) {
			res += L/u;
			res %= mod;
		}

		System.out.println(res);
		return ;
	}

	private long gcd(long a, long b) {
	    if (b == 0) return a;
	    else return gcd(b, a%b);
	}

	private long lcm(long a, long b) {
	    return (a / gcd(a, b) * b);
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
class Spell {
	public int power, cost;
	public Spell(int power, int cost) {
		this.power = power;
		this.cost = cost;
	}
}
