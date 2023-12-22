import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] ab = new int[m][2];
		for (int i = 0; i < m; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}

		Arrays.sort(ab, Comparator.comparingInt(x -> x[1]));

		int last = -1;
		int ansewr = 0;
		for (int i = 0; i < m; i++) {
			if (last <= ab[i][0]) {
				last = ab[i][1];
				ansewr++;
			}
		}

		System.out.println(ansewr);
	}
}
