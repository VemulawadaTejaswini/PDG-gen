import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];

		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++) {
			List<Integer> aList = new ArrayList<Integer>(Arrays.asList(a));
			aList.set(i, 0);
			System.out.println(getMax(aList));
		}
		sc.close();
	}

	private static int getMax(List<Integer> list) {
		int max = 0;
		for (Integer item : list) {
			if (max <= item) {
				max = item;
			}
		}
		return max;
	}
}
