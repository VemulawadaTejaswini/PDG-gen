import java.util.Arrays;
import java.util.Scanner;

class Main{
	static long GCD(long x, long y) {
		if(y == 0) return x;
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	static int GCD(int x, int y) {
		return (int)GCD((long)x, (long)y);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		Arrays.sort(A);
		for(int i = 1; i < N; i++) A[i] %= A[0];
		int ans = A[0];
		for(int i = 1; i < N; i++) {
			ans = Math.min(ans, GCD(A[0], A[i]));
		}
		System.out.println(ans);
	}
}