import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		String ans = "Yes";

		for (int i = n; i > 0; i--) {
			if (h[i] - h[i-1] > 1 ) {
				continue;

			}else if (h[i] - h[i-1] == 1 ) {
				h[i]--;

			} else {
				ans = "No";
				break;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}