import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		long x[] = new long[N];
		for (i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		ArrayList<Long> dim = new ArrayList<>();
		for (i = 0; i < N -1; i++) {
			long a = Math.abs(x[i] - x[i+1]);
			//System.out.println("a" + a);
			dim.add(a);
		}
		//if (X < 1) {

		long kouyakusuu = gcd(dim.get(0), dim.get(1));;
		for (i = 2; i < dim.size(); i++) {
			kouyakusuu = gcd(kouyakusuu, dim.get(i));
		}

		// 後で❷ xからの距離,上の公約数以下で一番大きいもの
		ArrayList<Long> dimx = new ArrayList<>();
		for (i = 0; i < N; i++) {
			long a = Math.abs(X - x[i]);
			if (a <= kouyakusuu) {
				dimx.add(a);
			}
		}
		Collections.sort(dimx, Comparator.reverseOrder());
		long ans = dimx.get(0);
		System.out.println(ans);

	}
	public static long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 0) {
			return a;
		}
		long r = a % b;
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}
}