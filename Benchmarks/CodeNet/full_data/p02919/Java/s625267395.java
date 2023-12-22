
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		int total = 0;

		for(int i = 0; i < n -1; i++) {
			for(int j = i + 1; j < n; j++) {
				int[] x = new int[j - i + 1];
				System.arraycopy(p, i, x, 0, j - i + 1);

				Arrays.sort(x);
				total += x[x.length - 2];
			}
		}
		System.out.println(total);
	}

}