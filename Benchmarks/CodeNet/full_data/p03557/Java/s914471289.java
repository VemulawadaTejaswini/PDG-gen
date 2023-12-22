import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < n; i++) b[i] = sc.nextInt();
		for(int i = 0; i < n; i++) c[i] = sc.nextInt();
		Arrays.sort(a);
		Arrays.sort(c);
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans += lowerBound(a, b[i]) * (n - upperBound(c, b[i]));
		}
		System.out.println(ans);
	}

	static long lowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(a[mid] >= x) r = mid;
			else l = mid;
		}
		return r;
	}

	static long upperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(a[mid] <= x) l = mid;
			else r = mid;
		}
		return r;
	}

}
