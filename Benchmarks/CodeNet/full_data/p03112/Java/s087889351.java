import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int Q = sc.nextInt();

		long[] shrines = new long[A];
		long[] temples = new long[B];

		for (int i = 0; i < A; i++) {
			shrines[i] = sc.nextLong();
		}

		for (int i = 0; i < B; i++) {
			temples[i] = sc.nextLong();
		}

		for (int q = 0; q < Q; q++) {
			long x = sc.nextLong();

			long r1 = 0;
			int ns = nearest(shrines, x);
			int nt = nearest(temples, shrines[ns]);
			r1 = Math.abs(x - shrines[ns]) + Math.abs(shrines[ns] - temples[nt]);

			long r2 = 0;
			nt = nearest(temples, x);
			ns = nearest(shrines, temples[nt]);
			r2 = Math.abs(x - temples[nt]) + Math.abs(temples[nt] - shrines[ns]);
			System.out.println(Math.min(r1, r2));
		}
		sc.close();
	}

	private int nearest(long[] loc, long x) {
		int lb = Math.min(loc.length-1, lowerBound(loc, x));
		if(lb==0) {
			return lb;
		}
		else if (Math.abs(loc[lb]-x) > Math.abs(loc[lb-1]-x)){
			return lb-1;
		}else {
			return lb;
		}
	}

	private int lowerBound(long[] arr, long key) {
		int left = -1;
		int right = arr.length;
		while (right - left > 1) {
			int mid = (left + right) / 2;
			if (arr[mid] < key) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return right;
	}

}