
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	private static int T, N, M;
	private static final String STR_FORMAT = "000000";

	private static class re {
		int x;
		String ID;
	}

	private static String AddOne(String cid) {
		Integer intHao = Integer.parseInt(cid);
		intHao++;
		DecimalFormat df = new DecimalFormat(STR_FORMAT);
		return df.format(intHao);
	}

	private static String Addzero(String cid) {
		Integer intHao = Integer.parseInt(cid);
		DecimalFormat df = new DecimalFormat(STR_FORMAT);
		return df.format(intHao);
	}

	private static void sort(int[][] ob, final int[] order) {
		Arrays.sort(ob, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int[] one = (int[]) o1;
				int[] two = (int[]) o2;
				for (int i = 0; i < order.length; i++) {
					int k = order[i];
					if (one[k] > two[k]) {
						return 1;
					} else if (one[k] < two[k]) {
						return -1;
					} else {
						continue; //
					}
				}
				return 0;
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// T = sc.nextInt();
		// for (int test_case = 1; test_case <= T; test_case++) {
		N = sc.nextInt();
		M = sc.nextInt();

		int array[][] = new int[M][3];

		re[] rt = new re[M];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.nextInt();

			}
			array[i][2] = i;
			rt[i] = new re();
			rt[i].x = i;

		}

		sort(array, new int[] { 0, 1 }); //
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i][0]);
		}

		Integer[] arr2 = set.toArray(new Integer[0]);
		for (int k = 0; k < arr2.length; k++) {
			// System.out.println(arr2[k]);
			int l = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i][0] == arr2[k]) {
					// for(int j=0;j<array[i].length;j++)
					// System.out.print(array[i][j]);
					for (int j = 0; j < rt.length; j++) {
						if (rt[j].x == array[i][2]) {
							rt[j].ID = Addzero(arr2[k].toString()) + AddOne(Integer.toString(l));

						}

					}

					// System.out.println(Addzero(arr2[k].toString())+AddOne(Integer.toString(l)));
					l++;
				} else
					l = 0;
			}
		}

		for (int i = 0; i < rt.length; i++) {
			System.out.println(rt[i].ID);

		}

	}

}

// }
