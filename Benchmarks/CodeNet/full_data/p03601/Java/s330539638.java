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

		double max = 0;
		int maxAll = 0;
		int maxSugar = 0;
		int sugarMax;
		int aMax;
		int bMax;
		int cMax;
		int cMax1;
		int cMax2;
		int dMax;
		int dMax1;
		int dMax2;
		double temp;

		aMax = f / a * 100;
		for (int i = 0; i <= aMax; i++) {
			bMax = (f - a * i * 100) / b * 100;
			for (int j = 0; j <= bMax; j++) {
				sugarMax = (a * i + b * j) * e;
				cMax1 = sugarMax / c;
				cMax2 = (f - a * i * 100 - b * j * 100) / c;
				if(cMax1 < cMax2) {
					cMax = cMax1;
				} else {
					cMax = cMax2;
				}
				for (int k = cMax; k >= 0; k--) {
					dMax1 = (sugarMax - k * c) / d;
					dMax2 = (f - a * i * 100 - b * j * 100 - c * k) / d;
					if(dMax1 < dMax2) {
						dMax = dMax1;
					} else {
						dMax = dMax2;
					}
					for (int l = dMax; l >= 0; l--) {
						if (!(i + j + k + l == 0)) {
							temp = (double) 100 * (c * k + d * l) / ((a * i + b * j) * 100 + (c * k + d * l));
							if (temp > e) {
								break;
							}
							if (temp > max) {
								max = temp;
								maxAll = (a * i + b * j) * 100 + c * k + d * l;
								maxSugar = c * k + d * l;
							}
							if (max == (double) 100 * e / (e + 100)) {
								System.out.print(maxAll);
								System.out.print(" ");
								System.out.print(maxSugar);
								return;
							}
						}
					}
				}
			}
		}
		if (max == 0) {
			maxAll = a * 100;
		}

		System.out.print(maxAll);
		System.out.print(" ");
		System.out.print(maxSugar);
	}
}
