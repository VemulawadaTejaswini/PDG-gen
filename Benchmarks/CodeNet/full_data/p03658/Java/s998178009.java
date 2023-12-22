import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, k, l[];

		n = sc.nextInt();
		k = sc.nextInt();
		l = new int[n];
		for (int i = 0; i < n; ++i)
			l[i] = sc.nextInt();
		sc.close();

		Arrays.sort(l);

		int max = 0;
		for (int i = n - 1; i >= n - k; --i)
			max += l[i];

		System.out.println(max);
	}

}
