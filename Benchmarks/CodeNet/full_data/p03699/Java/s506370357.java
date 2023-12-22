
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);

			int total = 0;
			boolean flg = false;
			for (int i : arr) {
				total += i;
				if (i % 10 != 0) {
					flg = true;
				}
			}
			if (total % 10 != 0) {
				System.out.println(total);
				return;
			}
			if (!flg) {
				System.out.println(0);
				return;
			}

			ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
			for (int i : arr) {
				list.add(i);
			}

			System.out.println(check(total, list));
		}
	}

	private static int check(int base, ArrayList<Integer> list) {
		for (int i : list) {
			int tmp = base - i;
			if (tmp % 10 != 0) {
				return tmp;
			}
		}
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
			list2.remove(i);
			int tmp = check(base - list.get(i), list2);
			if (result < tmp) {
				result = tmp;
			}
		}

		return result;
	}
}