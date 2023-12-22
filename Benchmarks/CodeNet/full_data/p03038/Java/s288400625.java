import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			long[] a = new long[n];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextLong();
			}
			
			for(int i=0; i<m; i++) {
				Arrays.sort(a);
				int s = sc.nextInt();
				int t = sc.nextInt();
				int result = Arrays.binarySearch(a, t-1);
				int insert = (result >= 0)?	result:~result;
				int min = Math.min(s, insert);
				for(int j=0; j<min; j++) {
					a[j] = t;
				}
			}
			long ans = 0;
			for(int i=0; i<n; i++) {
				ans += a[i];
			}
			System.out.println(ans);
		}
	}

}