
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();

		ArrayList<Integer> countss = new ArrayList<>();
		int[] a = new int[n * 2];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
			a[i + n] = j + k;
		}
		for (int x = 0; x < n; x++) {
			int count = Integer.MAX_VALUE;
			int m = x;
			while (m < n + x) { // 1 time
				int count2 = 0;
				for (int i = x; i < n + x; i++) {
					count2 += Math.abs(a[i] - a[m]);
				}
				if (count > count2) {
					count = count2;
				}
				m++;
			}
//			int count2 = a[i + 2] - a[i];
//			if (a[i + 1] + a[i + 2] - 2 * a[i] < count) {
//				count2 = a[i + 1] + a[i + 2] - 2 * a[i];
//			}
//			if (2 * a[i + 2] - a[i + 1] - a[i] < count) {
//				count2 = 2 * a[i + 2] - a[i + 1] - a[i];
//			}
//			if (count2 < count)
//				count = count2;
			countss.add(count);
		}
		Collections.sort(countss);
		System.out.println(countss.get(0));
		kb.close();
	}

}
