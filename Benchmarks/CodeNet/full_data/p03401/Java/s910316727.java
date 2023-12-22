import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 2];
		for (int i = 1; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i < n + 1; i++) {
			int cost = 0;
			for (int j = 0; j + 1 < n + 2; j++) {
				if (i != j)
					cost += Math.abs(a[j] - (j + 1 != i ? a[j + 1] : a[j + 2]));
			}
			System.out.println(cost);
		}
	}

}
