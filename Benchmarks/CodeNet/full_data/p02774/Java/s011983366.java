import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		long a[] = new long[n];
		long p[] = new long[n*(n-1)/2];
		int t = 0;

		for (int i = 0;i<n ;i++ ) {
			a[i] = sc.nextInt();
		}

		for (int i = 0;i<n ;i++ ) {
			for (int j = i+1;j<n ;j++ ) {
				p[t] = a[i]*a[j];
				t++;
			}
		}
		Arrays.sort(p);

		System.out.println(p[k-1]);

	}
}
