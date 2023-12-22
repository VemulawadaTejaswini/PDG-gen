import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		long sum = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += b[i];
			if(sum >= k) {
				System.out.println(a[i]);
				return;
			}
		}
	}
}
