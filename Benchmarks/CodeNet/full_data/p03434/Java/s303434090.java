import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] count) {

		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.next());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(scan.next());
		}

		scan.close();

		// start
		Arrays.sort(a);

		List<Integer> alice = new ArrayList<Integer>();
		List<Integer> bob = new ArrayList<Integer>();

		for (int i = a.length - 1; i >= 0; i--) {
			alice.add(a[i]);
			if (i >= 1) {
				bob.add(a[i - 1]);
				i--;
			}
		}

		long sum1 = alice.stream().reduce(Integer::sum).orElse(0);
		long sum2 = bob.stream().reduce(Integer::sum).orElse(0);

		System.out.println(sum1 - sum2);

	}

}
