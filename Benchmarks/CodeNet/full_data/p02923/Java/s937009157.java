import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		int max = 0;
		int befor = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				continue;
			}
			if (h[i] >= h[i + 1]) {
				max++;
			} else {
				max = 0;
			}
			if (befor < max) {
				befor = max;
			}
		}
		System.out.println(max);
	}
}