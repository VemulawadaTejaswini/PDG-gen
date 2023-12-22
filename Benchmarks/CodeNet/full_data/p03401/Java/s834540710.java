import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n+2];
		arr[0] = 0;
		arr[n+1] = 0;
		long cost = 0L;
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			cost += Math.abs(arr[i-1] - arr[i]);
		}
		cost += Math.abs(arr[n]);
		for(int i = 1; i <= n; i++) {
			long moto = Math.abs(arr[i-1]-arr[i])+Math.abs(arr[i]-arr[i+1]);
			long now = Math.abs(arr[i-1] - arr[i+1]);
			long a = cost - moto + now;
			System.out.println(a);
		}
	}
}