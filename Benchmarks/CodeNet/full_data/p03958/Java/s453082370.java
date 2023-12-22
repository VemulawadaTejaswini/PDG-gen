import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[t];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}

		if (max > (k + 1) / 2) {
			System.out.println(k - 1 - (k - max) * 2);
		} else {
			System.out.println(0);
		}
	}
}
