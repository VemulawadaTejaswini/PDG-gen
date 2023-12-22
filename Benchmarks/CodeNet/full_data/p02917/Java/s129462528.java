import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt() - 1;
		int[] b = new int[n];

		b[0] = sc.nextInt();
		int tmp = b[0];
		int count = tmp;

		for (int i = 1; i < n; i++) {
			b[i] = sc.nextInt();
			count += Math.min(b[i], tmp);
			tmp = b[i];
		}

		System.out.println(count + b[n - 1]);

	}
}