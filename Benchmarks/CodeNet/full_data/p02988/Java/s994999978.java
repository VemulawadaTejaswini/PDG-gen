import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int[] b = new int[3];

		int count = 0;

		for (int i = 1; i < n - 1; i++) {
			b[0] = a[i - 1];
			b[1] = a[i];
			b[2] = a[i + 1];
			Arrays.sort(b);
			if (b[1] == a[i])
				count++;
		}
		System.out.println(count);
	}

}
