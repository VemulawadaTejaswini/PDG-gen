import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		int size = list.size();
		int sizei = size - 2;
		int sizej = size - 1;
		long sum = 0;

		for (int i = 0; i < sizei; i++) {
			int li = list.get(i);
			for (int j = i + 1; j < sizej; j++) {
				int lj = list.get(j);
				int val = li + lj;
				for (int k = j + 1; k < size; k++) {
					int lk = list.get(k);
					if (val <= lk) {
						sum = sum + k - j - 1;
						break;
					} else if (k == sizej) {
						sum = sum + k - j;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
