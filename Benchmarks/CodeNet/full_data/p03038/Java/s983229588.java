
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[m];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long ans = 0;
		for(int i = 0; i < m; i++) {
			int j = 0;
			while(a[j] < c[i]) {
				if(j >= b[i]) {
					break;
				}
				a[j] = c[i];
				j++;
			}
			Arrays.sort(a);
		}
		for(int i = 0; i < n; i++) {
			ans += a[i];
		}
		System.out.println(ans);
		sc.close();
	}
}
