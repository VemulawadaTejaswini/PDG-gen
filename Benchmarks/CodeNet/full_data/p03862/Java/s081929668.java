import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		
		long[] a = new long[N];
		a[0] = sc.nextLong();
		
		long count = 0;
		
		for(int i = 1; i < N; i++) {
			a[i] = sc.nextLong();
			if(x - a[i - 1] >= 0) {
				if(a[i - 1] + a[i] > x) {
					count += a[i] - (x - a[i - 1]);
					a[i] = x - a[i - 1];
				}
			} else {
				count += a[i];
				a[i] = 0;
				count += a[i - 1] - x;
				a[i - 1] = x;
			}
		}		
		System.out.println(count);
	}
}
