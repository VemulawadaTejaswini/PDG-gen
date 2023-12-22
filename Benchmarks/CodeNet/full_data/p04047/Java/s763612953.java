import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		int[] l = new int[2 * n];

		for (int i = 0; i < l.length; i++) {
			l[i] = scan.nextInt();
		}

		Arrays.sort(l);

		for (int i = 0; i < l.length; i += 2) {
			ans += l[i];
		}

		System.out.println(ans);

		scan.close();
	}
}
