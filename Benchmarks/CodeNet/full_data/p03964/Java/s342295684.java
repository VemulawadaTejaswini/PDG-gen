import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long T = 1;
		long A = 1;
		for (int i = 0; i < n; i++) {
			long t = sc.nextLong(), a = sc.nextLong();
			long x = Math.max(div_ceil(T, t), div_ceil(A, a));
			T = t*x;
			A = a*x;
		}
		System.out.println(T+A);
		sc.close();
	}
	public static long div_ceil(long a, long b) {
		return (a+b-1)/b;
	}
}