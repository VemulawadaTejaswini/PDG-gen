import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	static int[] x, y;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		double ans = permutation(new int[n], new LinkedHashSet<>());
		for (int i = 1; i <= n; i++) {
			ans /= i;
		}
		System.out.println(ans);
	}

	static double permutation(int[] target, LinkedHashSet<Integer> set) {
		if (set.size() == target.length) {
			double d = 0;
			Integer[] arr = set.toArray(new Integer[0]);
			for (int i = 1; i < arr.length; i++) {
				d += Math.hypot(x[arr[i]] - x[arr[i - 1]], y[arr[i]] - y[arr[i - 1]]);
			}
			return d;
		}

		double ret = 0;
		for (int i = 0; i < target.length; i++) {
			if (!set.contains(i)) {
				set.add(i);
				ret += permutation(target, set);
				set.remove(i);
			}
		}
		return ret;
	}
}
