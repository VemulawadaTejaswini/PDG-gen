import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			Integer[] p = new Integer[n];
			Integer[] q = new Integer[n];
			for(int i = 0 ; i < n ; i++) {
				p[i] = sc.nextInt();
			}
			for(int i = 0 ; i < n ; i++) {
				q[i] = sc.nextInt();
			}
			// 使える数字
			List<Integer> list1 = new LinkedList<>();
			List<Integer> list2 = new LinkedList<>();
			for(int i = 0 ; i < n ; i++) {
				list1.add(p[i]);
				list2.add(p[i]);
			}
			Collections.sort(list1);
			Collections.sort(list2);
			// その桁に何個あるか
			int[] tmp = new int[n];
			tmp[n - 1] = 1;
			tmp[n - 2] = 1;
			for(int i = n - 3 ; i >= 0 ; i--) {
				tmp[i] = tmp[i + 1] * (n - 1 - i);
			}
			int a = rank(p, tmp, list1);
			int b = rank(q, tmp, list2);
			System.out.println(Math.abs(a - b));

		}
	}

	private static int rank(Integer[] p, int[] tmp, List<Integer> list) {
		int rank = 1;
		for(int i = 0 ; i < p.length - 1 ; i++) {
			int a = p[i];
			int index = list.indexOf(a);
			rank += index * tmp[i];
			list.remove(index);
		}
		return rank;
	}
}
