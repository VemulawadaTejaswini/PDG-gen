import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] obuget = new int[100010];
		int[] ebuget = new int[100010];
		int[] e = new int[100010];
		int[] o = new int[100010];

		int E = 0;
		int O = 0;
		int m = n/2;
		boolean f  = true;
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 1; i < n; i++) {
			if (a[i] != a[i-1]) {
				f = false;
			}
		}
		if (f) {
			System.out.println(n/2);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				ebuget[a[i]]++;
			} else {
				obuget[a[i]]++;
			}
		}

		System.arraycopy(ebuget, 0, e, 0, 100010);
		System.arraycopy(obuget, 0, o, 0, 100010);
		Arrays.sort(ebuget);
		Arrays.sort(obuget);
		E = ebuget[100009];
		O = obuget[100009];


		int ei = 0;
		int oi = 0;
		for (int i = 0; i < 100010; i++) {
			if (e[i] == E) {
				ei = i;
				break;
			}
		}
		for (int i = 0; i < 100010; i++) {
			if (o[i] == O) {
				oi = i;
				break;
			}
		}
		int E2 = 0;
		int O2 = 0;
		System.out.println(ei + " " +oi);
		if (ei == oi) {
			O2 = obuget[100008];
			E2 = ebuget[100008];
		}

		int eans = Math.min(m-E, m-E2);
		int oans = Math.min(m-O, m-O2);
		System.out.println(eans+oans);
	}
}