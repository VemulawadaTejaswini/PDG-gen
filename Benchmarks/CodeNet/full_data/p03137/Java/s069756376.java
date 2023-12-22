import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n >= m) {
			System.out.println(0);
			return;
		}

		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);
		int[] l = new int[x.length - 1];
		for (int i = 0; i < l.length; i++) {
			l[i] = x[i + 1] - x[i];
		}

		Arrays.sort(l);
		int answer = x[x.length - 1] - x[0];

		int j = l.length - 1;
		for (int i = 0; i < n - 1; i++) {
			answer -= l[j--];
		}

		System.out.println(answer);
	}
}
