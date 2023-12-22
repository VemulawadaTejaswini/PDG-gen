import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a = 0;
		int b = 0;
		int minus = 0;
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			a = Math.abs(x[i]-0)*2;
			b = Math.abs(x[i]-k)*2;
			minus += Math.min(a, b);
		}
		System.out.println(minus);
	}
}
