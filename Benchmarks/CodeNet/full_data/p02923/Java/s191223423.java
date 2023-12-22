import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] h = new int[n + 1];

		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}

		int max = 0;
		int now = 0;
		for (int i = 1; i < n; i++) {

			if (h[i] <= h[i - 1]) {
				now++;
				max = Math.max(max, now);
			} else {
				max = Math.max(max, now);
				now = 0;
			}
			//			System.out.println(i + " " + max + " " + now);
		}

		System.out.println(max);

		sc.close();
	}
}