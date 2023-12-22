import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		long[] x = new long[100010];
		for(int i = 0 ; i < n ; i++) {
			x[a[i]] = 0;
		}
		for(int i = 0 ; i < n ; i++) {
			x[a[i]] += b[i];
		}
		for(int i = 1 ; i <= 100000 ; i++) {
			if(x[i] == 0) continue;
			else if(x[i] > 0) {
				k -= x[i];
				if(k <= 0) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}
