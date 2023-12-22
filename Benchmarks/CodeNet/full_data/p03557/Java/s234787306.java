import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) b[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) c[i] = sc.nextInt();
		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(c);
		// 中段で全探索
		for(int i = 0 ; i < n ; i++) {
			ans += binarySearch(a, b[i]) * (n - binarySearch(c, b[i] + 1));
		}
		System.out.println(ans);
	}

	// array[i] < targetを満たす最大のiを求める
	public static long binarySearch(int[] array, int target) {
		int l = -1;
		int r = array.length;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(array[mid] < target) l = mid;
			else r = mid;
		}
		return r;
	}

}
