import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long c = Long.parseLong(sc.next());
		long[] x = new long[n];
		long[] v = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = Long.parseLong(sc.next());
			v[i] = Long.parseLong(sc.next());
		}
		long tem = -x[0] + v[0];
		long maxr = Math.max(0, tem);
		long indexr = 0;
		for (int i = 1; i < n; i++) {
			tem -= (x[i] - x[i - 1]);
			tem += v[i];
			if (tem > maxr) {
				maxr = tem;
				indexr = i;
			}
		}
		tem = -(c - x[n - 1]) + v[n - 1];
		long maxl = Math.max(0, tem);
		long indexl = n;
		for (int i = n - 2; i >= 0; i--) {
			tem -= (x[i + 1] - x[i]);
			tem += v[i];
			if (tem > maxl) {
				maxl = tem;
				indexl = i;
			}
		}
		long maxrd = 0;
		tem = 0;
		if (indexl > 0) {
			tem = v[0] - x[0] * 2;
			maxrd = Math.max(maxrd, tem);
		}
		for (int i = 1; i < indexl; i++) {
			tem -= ((x[i] - x[i - 1]) * 2);
			tem += v[i];
			maxrd = Math.max(maxrd, tem);
		}
		long maxld = 0;
		tem = 0;
		if (indexr < n - 1) {
			tem = v[n - 1] - (c - x[n - 1]) * 2;
			maxld = Math.max(maxld, tem);
		}
		for (int i = n - 2; i > indexr; i--) {
			tem -= (((x[i + 1] - x[i])) * 2);
			tem += v[i];
			maxld = Math.max(maxld, tem);
		}
		System.out.println(Math.max(maxr + maxld, maxl + maxrd));
	}
}