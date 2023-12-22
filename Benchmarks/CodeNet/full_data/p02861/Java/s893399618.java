import java.util.*;

public class Main {

	static long[] x, y;
	static long cnt = 0;

	public static double solve(int idx, int mask) {

		double sum = 0;
		boolean b = false;
		for (int i = 0; i < x.length; i++) {
			if ((mask & (1 << i)) == 0) {
				sum += solve(i, mask | (1 << i)) + dist(idx, i);
				b = true;
			}
		}
		if (!b)
			cnt++;

		return sum;
	}

	public static double dist(int i, int j) {
		if (i == -1)
			return 0;
		return Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
	}
//	8
//	-406 10
//	512 859
//	494 362
//	-955 -475
//	128 553
//	-986 -885
//	763 77
//	449 310

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		x = new long[n];
		y = new long[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double solve = solve(-1, 0);
//		System.out.println(solve);
//		for(int i=1;i<=n;i++)
//			solve/=i;

		System.out.println(solve / cnt);
	}

}
