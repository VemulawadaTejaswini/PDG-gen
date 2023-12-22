import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		int[] c = {0, 0, 0, 0, 0, 0, 0, 0};
		int b = 0, min = 0, max = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if (a[i] < 400) {
				// 灰色
				c[0] = 1;
			} else if (a[i] < 800) {
				// 茶色
				c[1] = 1;
			} else if (a[i] < 1200) {
				// 緑色
				c[2] = 1;
			} else if (a[i] < 1600) {
				// 水色
				c[3] = 1;
			} else if (a[i] < 2000) {
				// 青色
				c[4] = 1;
			} else if (a[i] < 2400) {
				// 黄色
				c[5] = 1;
			} else if (a[i] < 2800) {
				// 橙色
				c[6] = 1;
			} else if (a[i] < 3200) {
				// 赤色
				c[7] = 1;
			} else {
				b++;
			}
		}
		
		for (int i = 0; i < 8; i++) {
			if (c[i] == 1) {
				min++;
			}
		}
		
		max = min;
		
		if (b > 0 && max < 8) {
			if (b < (8 - max)) {
				max += b;
			} else {
				max = 8;
			}
		}
		
		if (min == 0) {
			min = 1;
		}

		System.out.println(min+" "+max);

		sc.close();
	}
}