import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		} 
		int b[] = new int[m];
		long c[] = new long[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextLong();
		}
		int sumb = 0;
		for (int i = 0; i < m; i++) {
			sumb += b[i];
		}
		long ac[] = new long[sumb + n];
		for (int i = 0; i < n; i++) {
			ac[i] = a[i];
		}
		int count = 0;
		int j = n;
		for (int i = 0; i < m; i++) {
			count = b[i];
			while (count != 0) {
				count--;
				ac[j] = c[i];
				j++;
			}
		}
		Arrays.sort(ac);
		long ansnum = 0;
		for (int i = sumb; i < sumb + n; i++) {
			ansnum += ac[i];
		}
		System.out.println(ansnum);
	}
}