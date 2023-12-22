import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int H = sc.nextInt();
		int[] h = new int[H + 1];
		int sum = 0;
		int c = 0;
		boolean t = false, z = false;

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
					z = true;
				} else {
					if (t) {
						c++;
						z = false;
					}
					t = false;
				}
			}
			if (z) {
				c++;
			}
			t = false;
		}

		System.out.println(c);

		sc.close();
	}
}
