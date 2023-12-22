import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		h[0]--;
		for (int i = 1; i < n; i++) {
			if (h[i] < h[i - 1]) {
				System.out.println("No");
				return;
			}
			if (h[i] > h[i - 1]) {
				h[i]--;
			}
		}
		System.out.println("Yes");
	}
}
