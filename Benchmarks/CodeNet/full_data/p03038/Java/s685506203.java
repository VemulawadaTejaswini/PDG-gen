import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.parallelSort(a);
//		int[] b = new int[m];
//		int[] c = new int[m];
//		for (int i = 0; i < m; i++) {
//			b[i] = scanner.nextInt();
//			c[i] = scanner.nextInt();
//		}
		//
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < m; i++) {
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + b);
			} else {
				map.put(c, b);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int b = Math.min(entry.getValue(), n);
			int c = entry.getKey();
			int actual = 0;
			for (int i = 0; i < b; i++) {
				if (a[i] < c) {
					a[i] = c;
				} else {
					actual = i;
					break;
				}
			}
			if (actual > 0) {
				actual = 0;
			} else {
				int position = b;
				while ( position < n && a[position] < c ) {
					position++;
				}
				if (position > b) {
					Arrays.parallelSort(a, 0, position);
				}
			}
		}
//	}

//		
		
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < b[i]; j++) {
//				if (a[j] < c[i]) {
//					a[j] = c[i];
//				}
//			}
//			// 毎回ソートをかけると時間切れになる
//			Arrays.parallelSort(a);
//		}
		long result = 0;
		for (int i = 0; i < n; i++) {
			result = result + (long) a[i];
		}
		System.out.println(result);
	}
}
