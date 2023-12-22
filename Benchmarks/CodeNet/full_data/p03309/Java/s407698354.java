import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt() - (i + 1);
		}

		Arrays.sort(a);
		int center = a[(int)(n / 2)];

		int ans = 0;
		for(int j = 0; j < n; j++) {
			ans += Math.abs(a[j] - center);
		}

		System.out.println(ans);
    }
}
