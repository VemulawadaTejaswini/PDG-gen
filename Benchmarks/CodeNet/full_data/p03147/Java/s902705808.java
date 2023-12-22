import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int H = sc.nextInt();
		int[] h = new int[H + 1];
		int sum = 0;
		int c = 0;
		boolean t = false;

		for (int i = 0; i < H; i++) {
			h[i] = sc.nextInt();
			sum += h[i];
		}

		while (sum > 0) {
			for (int i = 0; i < H; i++) {
				if (h[i] > 0) {
					h[i]--;
					sum--;
					t = true;
				} else {
					if (t && i != (H-1)) {
						c++;
					}
					t = false;
				}
				if (sum == 0) {
					break;
				}
			}
			c++;
			t = false;
		}

		System.out.println(c);

		sc.close();
	}
}
