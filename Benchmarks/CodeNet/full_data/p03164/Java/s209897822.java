
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int W = in.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; ++i) {
			w[i] = in.nextInt();
			v[i] = in.nextInt();

		}
		long r = solve(n, W, w, v);
		System.out.println(r);
		in.close();
	}

	private static long solve(int n, int W, int[] w, int[] v) {
		int maxValue = 0;
		for (int i = 0; i < v.length; i++) {
			maxValue += v[i];
		}
		long[] state = new long[maxValue + 1];
		Arrays.fill(state, Long.MAX_VALUE);
		state[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = maxValue; j >= v[i - 1]; j--) {
				if (state[j - v[i - 1]] != Long.MAX_VALUE) {
					state[j] = Math.min(state[j], state[j - v[i - 1]] + w[i - 1]);
				}

			}
		}
		for (int i = state.length - 1; i >= 0; i--) {
			if (state[i] <= W) {
				return i;
			}
		}
		return -1;
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
