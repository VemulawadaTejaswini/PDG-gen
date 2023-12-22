import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		long total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		if (total < k) {
			System.out.println(n);
			return;
		}
		Arrays.sort(arr);
		TreeSet<Integer>[] sets = new TreeSet[n];
		TreeSet<Integer>[] rsets = new TreeSet[n];
		sets[0] = new TreeSet<Integer>();
		sets[0].add(0);
		rsets[0] = new TreeSet<Integer>();
		rsets[0].add(0);
		for (int i = 0; i < n - 1; i++) {
			sets[i + 1] = new TreeSet<Integer>(sets[i]);
			rsets[i + 1] = new TreeSet<Integer>(rsets[i]);
			for (int x : sets[i]) {
				if (x + arr[i] < k) {
					sets[i + 1].add(arr[i] + x);
				}
			}
			for (int x : rsets[i]) {
				if (x + arr[n - i - 1] < k) {
					rsets[i + 1].add(arr[n - i - 1] + x);
				}
			}
		}
		int left = 0;
		int right = n - 1;
		int max = -1;
		while (left <= right) {
			int m = (left + right) / 2;
			if (check(sets[m], rsets[n - m - 1], arr[m], k)) {
				left = m + 1;
				max = Math.max(max, m);
			} else {
				right = m - 1;
			}
		}
		System.out.println(max + 1);
	}
	
	
	static boolean check(TreeSet<Integer> leftSet, TreeSet<Integer> rightSet, int target, int max) {
		for (int x : leftSet) {
			int y = rightSet.lower(max - x);
			if (x + y >= max - target) {
				return false;
			}
		}
		return true;
	}
}
