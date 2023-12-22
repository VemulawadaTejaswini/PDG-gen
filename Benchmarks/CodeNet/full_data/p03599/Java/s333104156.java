import jdk.nashorn.internal.ir.LabelNode;

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
		int[] ws = new int[]{1, 0};

		for (int i = 0; i <= 3000; i++) {
			for (int j = 0; j <= 3000; j++) {
				int water = ((a * i) + (b * j)) * 100;
				if (water == 0 || water >= f) break;
				int cap = Math.min(f - water, (water / 100) * e);
				for (int k = 0; k <= 3000; k++) {
					for (int l = 0; l <= 3000; l++) {
						int sugar = k * c + l * d;
						if (sugar > cap || water + sugar > f) break;
						if (rate * (sugar + water) <= sugar) {
							rate = (double) sugar / (water + sugar);
							ws[0] = water;
							ws[1] = sugar;
						}
					}
				}
			}
		}

		System.out.println(ws[0] + ws[1] + " " + ws[1]);
	}
}
