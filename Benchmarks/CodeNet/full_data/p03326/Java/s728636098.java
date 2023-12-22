import java.util.Scanner;
 
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	
	static long[] x = new long[N];
	static long[] y = new long[N];
	static long[] z = new long[N];
 
	public static void main(String[] args) {
		for (int i = 0; i < N; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			z[i] = sc.nextInt();
		}
		
		System.out.println(calc(calcMax(new int[M], 0, M)));
	}
	
	private static int[] calcMax(int[] cakes, int i, int n) {
		if (i == N || n == 0) {
			return cakes;
		}
		
		long max = Long.MIN_VALUE;
		int[] max_cakes = new int[M];
		for (int j = i; j < N; ++j) {
			int[] new_cakes = cakes.clone();
			new_cakes[M - n] = j;
			
			if (i != 0) {
				if (calc(new_cakes) <= calc(cakes)) {
					continue;
				}
			}
			
			int[] temp_cakes = calcMax(new_cakes, j + 1, n - 1);
			long temp = calc(temp_cakes);
			if (max < temp) {
				max = temp;
				max_cakes = temp_cakes;
			}
		}
		
		return max_cakes;
	}
	
	private static long calc(int[] cakes) {
		long xsum = 0;
		for (int i = 0; i < cakes.length; ++i) {
			xsum += x[cakes[i]];
		}
		
		xsum = Math.abs(xsum);
		
		long ysum = 0;
		for (int i = 0; i < cakes.length; ++i) {
			ysum += y[cakes[i]];
		}
		ysum = Math.abs(ysum);
		
		long zsum = 0;
		for (int i = 0; i < cakes.length; ++i) {
			zsum += z[cakes[i]];
		}
		zsum = Math.abs(zsum);
		
		
		return xsum + ysum + zsum;
	}
}