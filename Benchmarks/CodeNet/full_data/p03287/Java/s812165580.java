import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int m = Integer.parseInt(tokens[1]);
		int[] a = new int[n];
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(tokens[i]) % m;
		}

		long[] b = new long[n + 1];
		b[0] = 0;
		long sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += a[i];
			b[i + 1] = sum;
		}
		Map<Integer, List<Integer>> map = new TreeMap<>();
		for (int i = 0; i <= n; ++i) {
			int mod = (int) (b[i] % m);
			if (!map.containsKey(mod)) {
				map.put(mod, new ArrayList<Integer>());
			}
			map.get(mod).add(i);
		}

		long result = 0;
		for (List<Integer> list : map.values()) {
			result += getKaijo(list.size() - 1);
		}
		System.out.println(result);
		in.close();
	}

	public static long getKaijo(long v) {
		long result = 0;
		for (long i = v; i >= 1; --i) {
			result += i;
		}
		return result;
	}
}