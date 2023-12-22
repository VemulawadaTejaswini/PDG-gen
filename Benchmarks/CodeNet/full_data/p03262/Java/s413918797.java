import java.util.Arrays;
import java.util.Scanner;

class NumTh{
	static long mod=1000000007; // 10e9 + 7
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt();
		int[] x = new int[N + 1];
		for(int i = 0; i < N; i++) x[i] = sc.nextInt();
		x[N] = X;
		Arrays.sort(x);
		int ans = x[1] - x[0];
		for(int i = 2; i < N + 1; i++) {
			ans = NumTh.GCD(ans, x[i] - x[i - 1]);
		}
		System.out.println(ans);
	}
}