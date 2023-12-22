import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] aArray = new int[n];
		// List<Integer> valueList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			aArray[i] = sc.nextInt();
		}
		Arrays.sort(aArray);
		int minimumValue = aArray[0];
		for (int i = 0; i < m; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (c < minimumValue) {
				continue;
			}
			for (int j = 0; j < b; j++) {
				int curA = aArray[j];
				if (curA < c) {
					aArray[j] = c;
				} else {
					break;
				}
			}
			Arrays.sort(aArray);
		}

		// Collections.sort(valueList);
		// Collections.reverse(valueList);

		long result = 0;

		for (int i = 0; i < n; i++) {
			result += aArray[i];
			// System.out.println(valueList.get(i));
		}

		System.out.println(result);

	}

}
