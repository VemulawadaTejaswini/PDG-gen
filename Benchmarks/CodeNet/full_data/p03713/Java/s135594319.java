import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int h = sc.nextInt();
		int w = sc.nextInt();
		double ans = 100000 * 100000, max = 0, min = 0, a = 0, b = 0, c = 0;
		double j = 0;

		if ((h * w) % 3 != 0) {
			if (w >= 3) {
				// 縦割
				j = Math.floor(w / 3);
				max = 0;
				min = 0;
				a = h * j;
				b = h * (w - j) / 2;
				c = h * (w - ((w - j) / 2));
				// System.out.println("1a:" + a + " b:" + b + " c:" + c);
				if (a >= b && a >= c) {
					max = a;
				} else if (b >= a && b >= c) {
					max = b;
				} else {
					max = c;
				}
				if (a <= b && a <= c) {
					min = a;
				} else if (b <= a && b <= c) {
					min = b;
				} else {
					min = c;
				}
				if (ans > (max - min)) {
					ans = max - min;
					// System.out.println("1max:" + max + " min:" + min + " ans:" + ans);
				}
			}

			if (h >= 3 && h != w) {
				// 横割
				j = Math.floor(h / 3);
				max = 0;
				min = 0;
				a = w * j;
				b = w * Math.floor((h - j) / 2);
				c = w * (h - Math.floor((h - j) / 2));
				if (a >= b && a >= c) {
					max = a;
				} else if (b >= a && b >= c) {
					max = b;
				} else {
					max = c;
				}
				if (a <= b && a <= c) {
					min = a;
				} else if (b <= a && b <= c) {
					min = b;
				} else {
					min = c;
				}
				if (ans > (max - min)) {
					ans = max - min;
					// System.out.println("2max:" + max + " min:" + min + " ans:" + ans);
				}
			}

			// 縦T
			for (int i = 1; i < h; i++) {
				j = Math.floor(w / 2);
				max = 0;
				min = 0;
				a = i * w;
				b = (h - i) * j;
				c = (h - i) * (w - j);
				if (a >= b && a >= c) {
					max = a;
				} else if (b >= a && b >= c) {
					max = b;
				} else {
					max = c;
				}
				if (a <= b && a <= c) {
					min = a;
				} else if (b <= a && b <= c) {
					min = b;
				} else {
					min = c;
				}
				if (ans > (max - min)) {
					ans = max - min;
					// System.out.println("3max:" + max + " min:" + min + " ans:" + ans);
				}
			}

			if (h != w) {
				// 横T
				for (int i = 1; i < w; i++) {
					j = Math.floor(h / 2);
					max = 0;
					min = 0;
					a = h * i;
					b = j * (w - i);
					c = (h - j) * (w - i);
					if (a >= b && a >= c) {
						max = a;
					} else if (b >= a && b >= c) {
						max = b;
					} else {
						max = c;
					}
					if (a <= b && a <= c) {
						min = a;
					} else if (b <= a && b <= c) {
						min = b;
					} else {
						min = c;
					}
					if (ans > (max - min)) {
						ans = max - min;
						// System.out.println("4max:" + max + " min:" + min + " ans:" + ans);
					}
				}
			}
		} else {
			ans = 0;
		}

		System.out.println(ans);

		sc.close();
	}
}
