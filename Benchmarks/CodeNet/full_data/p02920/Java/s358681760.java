import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n2 = 1 << n;
		int[] s = new int[n2];
		for (int i = 0; i < n2; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();

		int inf = Integer.MAX_VALUE;
		Arrays.sort(s);
		reverse(s);
		List<Integer> list = new ArrayList<>(n2);
		list.add(s[0]);
		s[0] = inf;
		for (int i = 0; i < n; i++) {
			Collections.sort(list, Collections.reverseOrder());
			int size = list.size();
			int idx = 0;
			for (int j = 0; j < size; j++) {
				int sj = list.get(j);
				while (idx < n2 && s[idx] >= sj) {
					idx++;
				}
				if (idx >= n2) {
					System.out.println("No");
					return;
				}
				list.add(s[idx]);
				s[idx] = inf;
				idx++;
			}
		}
		System.out.println("Yes");
	}

	static void reverse(int[] a) {
		int len = a.length;
		int end = len / 2;
		int tmp = 0;
		for (int i = 0; i < end; i++) {
			tmp = a[i];
			a[i] = a[len - 1 - i];
			a[len - 1 - i] = tmp;
		}
	}
}
