import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		int[] d = new int[n + 1];
		d[0] = 0;
		int count = 1;

		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {

			if (d[i - 1] + l[i - 1] <= x) {
				d[i] = d[i - 1] + l[i - 1];
				count++;
			} else {
				break;
			}

		}

		System.out.println(count);
	}
}