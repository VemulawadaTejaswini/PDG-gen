import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		double rate = 0.0;
		int[] answer = new int[2];

		for (int i = 0; i <= a; i++) {
			int water = a * i * 100;
			if (water > f) break;
			for (int j = 0; j <= b; j++) {
				water += b * j * 100;
				if (water <= 0 || water >= f) break;
				int cap = Math.min(f - water, (water / 100) * e);
				int s = cap / c;
				int t = cap / d;
				int u = cap / (c + d);


				int sugar = Math.max(
						s * c + ((cap % c) / d) * d,
						t * d + ((cap % d) / c) * c
				);
				sugar = Math.max(sugar, u * (c + d) + (cap % (c + d) / c) * c);
				sugar = Math.max(sugar, u * (c + d) + (cap % (c + d) / d) * d);

				if (100.0 * sugar / ((double) water + sugar) > rate) {
					rate = 100.0 * sugar / ((double) water + sugar);
					answer[0] = water + sugar;
					answer[1] = sugar;
				}
			}
		}

		System.out.println(answer[0] + " " + answer[1]);
	}
}
