import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[][] bingo = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		int alice = 0;
		int bob = 0;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				alice += a[a.length - 1 - i];
			} else {
				bob += a[a.length - 1 - i];
			}
		}

		System.out.println(Math.abs(alice - bob));

	}
}
