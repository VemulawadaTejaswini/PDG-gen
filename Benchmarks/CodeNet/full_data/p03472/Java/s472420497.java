import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();

		int maxa = 0;

		int count = 0;
		int attack = 0;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			maxa = Math.max(maxa, a);

			list.add(b);
		}

		list.sort(Comparator.reverseOrder());

		for (int num : list) {
			if (num > maxa) {

				attack += list.get(count);
				count++;

				if (attack >= h)
					break;
			}
		}

		count += (h - attack + maxa - 1) / maxa;
		//
		//		while (attack < h) {
		//			attack += maxa;
		//			count++;
		//		}

		System.out.println(count);

		sc.close();

	}
}