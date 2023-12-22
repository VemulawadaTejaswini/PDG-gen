import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		} 
		int b[] = new int[m];
		int c[] = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		int num = 0;
		for (int j = 0; j < m; j++) {
			Arrays.sort(a);
			num = 0;
			while (a[num] < c[j] & num < b[j]) {
				a[num] = c[j];
				num++;
			}
		}
		long ansnum = 0;
		for (int i = 0; i < n; i++) {
			ansnum += a[i];
		}
		System.out.println(ansnum);
	}
}