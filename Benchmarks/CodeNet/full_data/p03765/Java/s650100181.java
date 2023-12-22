import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] e = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int q = sc.nextInt();
		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		StringBuffer buf = new StringBuffer();

		String[] ss = new String[] { S, T };
		int[][][] p = new int[ss.length][5][];
		for (int i = 0; i < ss.length; i++) {
			p[i][0] = new int[100010];
			p[i][1] = new int[10010];
			p[i][2] = new int[1010];
			p[i][3] = new int[110];
			p[i][4] = new int[20];
			for (int j = 0; j < ss[i].length(); j++) {
				int x = (ss[i].charAt(j) == 'A') ? 1 : 2;
				p[i][0][j] = (p[i][0][j] + x) % 3;
				p[i][1][j / 10] = (p[i][1][j / 10] + x) % 3;
				p[i][2][j / 100] = (p[i][1][j / 100] + x) % 3;
				p[i][3][j / 1000] = (p[i][1][j / 1000] + x) % 3;
				p[i][4][j / 10000] = (p[i][1][j / 10000] + x) % 3;
			}
		}
		for (int i = 0; i < q; i++) {
			int[][] r = new int[][] { { a[i], b[i] }, { c[i], d[i] } };
			int[] chk = new int[2];
			for (int j = 0; j <= 1; j++) {
				for (int k = r[j][0] - 1; k < r[j][1];) {
					if (k / 10000 * 10000 == k
							&& (k / 10000 + 1) * 10000 <= r[j][1]) {
						chk[j] = (chk[j] + p[j][4][k / 10000]) % 3;
						k += 10000;
					} else if (k / 1000 * 1000 == k
							&& (k / 1000 + 1) * 1000 <= r[j][1]) {
						chk[j] = (chk[j] + p[j][3][k / 1000]) % 3;
						k += 1000;
					} else if (k / 100 * 100 == k
							&& (k / 100 + 1) * 100 <= r[j][1]) {
						chk[j] = (chk[j] + p[j][2][k / 100]) % 3;
						k += 100;
					} else if (k / 10 * 10 == k
							&& (k / 10 + 1) * 10 <= r[j][1]) {
						chk[j] = (chk[j] + p[j][1][k / 10]) % 3;
						k += 10;
					} else {
						chk[j] = (chk[j] + p[j][0][k]) % 3;
						k += 1;
					}
				}
			}
			if (chk[0] == chk[1]) {
				buf.append("YES\n");
			} else {
				buf.append("NO\n");
			}
		}

		System.out.println(buf.toString());
	}
}
