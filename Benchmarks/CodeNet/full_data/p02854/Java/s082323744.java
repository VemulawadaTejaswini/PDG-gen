import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		a[0] = sc.nextLong();
		for(int i = 1; i < n; i++) {
			a[i] = sc.nextLong()+a[i-1];
		}
		long min = Long.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			min = Math.min(min, Math.abs(a[n-1]-a[i]*2));
		}
		System.out.println(min);
	}
}
