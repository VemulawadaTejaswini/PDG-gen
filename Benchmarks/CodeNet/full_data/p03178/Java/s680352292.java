
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String k = in.next();
		int d = in.nextInt();
		long r = solve(k, d);
		System.out.println(r);
		in.close();
	}

	private static long solve(String k, int d) {
		int l = k.length();
		long[][] dp = new long[l + 1][d];
		dp[0][0] = 1;
		for (int i = 1; i <= l; i++) {
			for (int j = 0; j < d; j++) {
				for (int m = 0; m < 10; m++) {
					dp[i][j] = add(dp[i][j], dp[i - 1][(j + d - m % d) % d]);
				}
			}
		}
		long r = 0;
		int offset = 0;
		for (int i = 0; i < l; i++) {
			int v = Integer.parseInt(k.charAt(i) + "");
			for (int j = 0; j < v; j++) {
				r = add(r, dp[l - i - 1][(d - (j + offset) % d) % d]);
			}
			offset = (offset + v) % d;
		}
		if (offset == 0) {
			return r;
		} else {
			return add(r, -1);
		}

	}

	static long mod = 1000000007;

	static long add(long a, long b) {
		long r = a + b;
		if (r < 0) {
			r += mod;
		}
		return r % mod;
	}

	static long mul(long a, long b) {
		return (a * b) % mod;
	}

	static String str(int[] a) {
		String[] str = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			str[i] = a[i] + "";
		}
		return String.join(" ", str);
	}

	static int[] getIntArr(Scanner in, int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

	static int[][] getIntArr(Scanner in, int row, int col) {
		int[][] arr = new int[row][];
		for (int i = 0; i < row; i++) {
			arr[i] = getIntArr(in, col);
		}
		return arr;
	}

	static char[] getCharArr(Scanner in, int size) {
		char[] arr = in.next().toCharArray();
		return arr;
	}

	static String[] getStringArr(Scanner in, int size) {
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.next();
		}
		return arr;
	}

	static Map<Integer, List<Integer>> getEdges(Scanner in, int size, boolean directed) {
		Map<Integer, List<Integer>> edges = new HashMap<>();
		for (int i = 0; i < size; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			if (!edges.containsKey(from)) {
				edges.put(from, new ArrayList<Integer>());
			}
			edges.get(from).add(to);
			if (!directed) {
				if (!edges.containsKey(to)) {
					edges.put(to, new ArrayList<Integer>());
				}
				edges.get(to).add(from);
			}

		}
		return edges;
	}
}
