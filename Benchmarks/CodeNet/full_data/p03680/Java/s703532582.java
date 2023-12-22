

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n+1];

		for (int i = 1; i < n+1; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int b = 1;
		int ans = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);

		for (int i = 1; i < n + 1; i++) {
			b = a[b];

			if (b == 2) {
				ans = i;
				break;
			}

			if (map.containsKey(b)) {
				break;
			}
		}

		System.out.println(ans);
	}

}
