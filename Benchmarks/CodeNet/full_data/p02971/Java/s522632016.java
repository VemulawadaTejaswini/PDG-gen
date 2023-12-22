import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		Integer[] tmpA = new Integer[n];

		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			tmpA[i] = a[i];
		}

		Arrays.sort(tmpA, Collections.reverseOrder());

		int first = tmpA[0];
		int second = tmpA[1];

		for (int i=0; i<n; i++) {
			if (a[i] == first) {
				System.out.println(second);
			} else {
				System.out.println(first);
			}
		}
		sc.close();
	}
}
