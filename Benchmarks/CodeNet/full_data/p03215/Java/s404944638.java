import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {
	private static int globalMask = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();

		}

		int test[][] = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				if (i - j == 0) {
					test[i][j] = a[i];
				} else {
					test[i][j] = test[i][j - 1] + a[j];

				}

				list.add(test[i][j]);
			}
		}

		List<Integer> ansList = makeMaskedList(list, k);


		ansList.sort(Comparator.reverseOrder());

		// System.out.println(ansList);

		// System.out.println(list);
		// System.out.println(ans);

		int ans = globalMask;

		for (int l = 0; l < k; l++) {

			ans = ans & ansList.get(l);

		}
		System.out.println(ans);

		sc.close();

	}

	static List<Integer> makeMaskedList(List<Integer> list, int k) {
		list.sort(Comparator.reverseOrder());

		int b = list.get(k);
		int count = 0;

		while (b > 0) {
			b = b >> 1;
			count++;
		}

		int mask = (int) Math.pow(2, count) - 1;

		for (int l = k - 1; l >= 0; l--) {
			list.add(mask & list.get(l));
			list.remove(l);
		}

		// System.out.println(list);


		if(mask == globalMask) {
			return list;

		} else {
			globalMask = mask;
			return makeMaskedList(list, k);
		}
	}
}