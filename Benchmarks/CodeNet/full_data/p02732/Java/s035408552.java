

import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		int sum = 0;
		for (int i : map.values()) {
			sum += i * (i - 1) / 2;
		}

		int[] ans = new int[n];

		int b = 0;
		for (int i = 0; i < n; i++) {
			b = map.get(a[i]) - 1;
			if (b > 0)
				ans[i] = sum - b;
			else
				ans[i] = sum;
		}

		for (int i : ans) {
			System.out.println(i);
		}
	}

}
