import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		long temp1 = 0;
		long temp2 = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			list.add(a[i]);
		}
		Collections.sort(list);
		if (n % 2 == 1) {
			for (int i = 0; i < n/2-1; i++) {
				sum += (list.get(i)) * -2;
			}
			sum += list.get(n/2-1) * -1;
			sum += list.get(n/2) * -1;
			for (int i = n/2+1; i < n; i++) {
				sum += list.get(i) * 2;
			}
			temp1 += (list.get(n/2-1) * -1) + (list.get(n/2) * -1) + (list.get(n/2+1) * 2);
			temp2 += (list.get(n/2)) + (list.get(n/2+1)) + (list.get(n/2-1) * -2);
			if (temp1 < temp2) {
				sum += temp2 - temp1;
			}
			System.out.println(sum);
		} else {
			for (int i = 0; i < n/2-1; i++) {
				sum += (list.get(i)) * -2;
			}
			sum += list.get(n/2-1) * -1;
			sum += list.get(n/2);
			for (int i = n/2+1; i < n; i++) {
				sum += list.get(i) * 2;
			}
			System.out.println(sum);
		}
	}
}