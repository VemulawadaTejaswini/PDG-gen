import java.util.Arrays;
import java.util.Scanner;

public class　Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		int v = sc.nextInt();
		int p = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = (-1)*sc.nextInt();
		Arrays.sort(a);
		for (int i = 0; i < n; i++) a[i] = (-1)*a[i];
		boolean flag = true;
		int r = n; int l = p-1;

		while(r-l > 1) {
			int mid = (r+l)/2;
			if(a[mid]+m < a[p-1]) {
				flag = false;
			}else {
				long sum = (n-mid+p-1)*m;
				for (int i = p-1; i < mid; i++) {
					sum += a[mid]+m-a[i];
				}
				if(sum < m*v) flag = false;
				else flag = true;
			}
			if(flag) l = mid;
			else r = mid;
		}

		System.out.println(l+1);
		sc.close();
	}
}