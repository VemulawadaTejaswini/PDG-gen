import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		int[] a = new int[n * 2];
		ArrayList<Integer> counts = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
			a[i + n] = j + k;
		}
		for (int i = 0; i < n; i++) {
			int count = a[i + 2] - a[i];
			if (a[i + 1] + a[i + 2] - 2 * a[i] < count) {
				count = a[i + 1] + a[i + 2] - 2 * a[i];
			}
			if (2 * a[i + 2] - a[i + 1] - a[i] < count) {
				count = 2 * a[i + 2] - a[i + 1] - a[i];
			}
			counts.add(count);
		}
		Collections.sort(counts);
		System.out.println(counts.get(0));
		kb.close();
	}

}
