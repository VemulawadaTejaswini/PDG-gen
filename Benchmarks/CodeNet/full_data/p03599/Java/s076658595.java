import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		sc.close();

		int ansW = 0;
		int ansS = 0;
		double max = 0d;
		for (int a = 0; a <= 30; a++) {
			for (int b = 0; b <= 15; b++) {
				int water = a * A + b * B;
				for (int c = 0; c <= 1500; c++) {
					for (int d = 0; d <= 750; d++) {
						int sugar = c * C + d * D;
						int ws = water * 100 + sugar;
						if (ws <= F && sugar <= E * water) {
							double noudo = calc(ws, sugar);
							if (max < noudo) {
								ansW = ws;
								ansS = sugar;
							}
						}
					}
				}
			}
		}
		System.out.println(ansW + " " + ansS);
	}

	static double calc(int a, int b) {
		return 100d * b / a;
	}
}
