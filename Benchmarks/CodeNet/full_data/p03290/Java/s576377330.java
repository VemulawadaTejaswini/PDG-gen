import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int g = sc.nextInt();
		int[] p = new int[d];
		int[] c = new int[d];
		int bin = 0, point = 0, ans = Integer.MAX_VALUE, cnt = 0, max = 0;
		boolean target = true;

		for (int i = 0; i < d; i++) {
			p[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		bin = (int) Math.pow(2, d);
		for (int i = 0; i < bin; i++) {
			for (int j = 0; j < Integer.toBinaryString(bin).length(); j++) {
				if (Integer.toBinaryString(bin).substring(j, j + 1).equals("1")) {
					point += p[j] * (j + 1) * 100 + c[j];
					cnt += p[j];
				} else if (target) {
					max = j;
					target = false;
				}
			}
			if (g <= point) {
				if (cnt < ans) {
					ans = cnt;
				}
			} else {
				int x = p[max];
				while (0 < x) {
					point += (max + 1) * 100;
					cnt++;
					x--;
					if (g <= point) {
						if (cnt < ans) {
							ans = cnt;
						}
					}
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
