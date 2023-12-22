import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long k = sc.nextLong();

		List list = new ArrayList();
		for (int i = 0; i < min((int)k/a+1, n+1); i++) {
			for (int j = 0; j < min((int)(k-i*a)/(a+b)+1, n-i+1); j++) {
				for (int l = 0; l < min((int)(k-i*a-j*(a+b))/b+1, n-i-j+1); l++) {
					if (i*a + j*(a+b) + l*b == k) {
						list.add(new int[] {i, j, l});
						System.out.println(i +  ", " + j + ", " + k);
					}
				}
			}
		}

		long ans = 0;
		Iterator ite = list.iterator();
		while (ite.hasNext()) {
			int[] ary = (int[])ite.next();
			long tmp = 1;
			if (ary[0] > 0) {
				tmp *= C(n, ary[0]);
			}
			if (ary[1] > 0) {
				tmp *= C(n-ary[0], ary[1]);
			}
			if (ary[2] > 0) {
				tmp *= C(n-ary[0]-ary[1], ary[2]);
			}
			ans += tmp;
		}

		System.out.println(ans%998244353);

	}

	private static int C(int n, int k) {
		if (k==1) {
			return n;
		} else {
			return C(n-1, k-1)*n/k;
		}

	}

	private static int min(int x, int y) {
		if (x <= y) {
			return x;
		} else {
			return y;
		}
	}
}