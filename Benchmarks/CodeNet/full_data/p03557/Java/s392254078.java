import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n;
	static Scanner sc;
	static int[] a = new int[n], b = new int[n], c = new int[n];
	static{
		sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) b[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) c[i] = sc.nextInt();
	}

	public static void main(String[] args) {
		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(c);
		for(int i  = 0 ; i < n ; i++) {
			ans += binary_search(a, b[i]) * (n - binary_search(c, b[i]));
		}
		System.out.println(ans);
	}

	public static int binary_search(int[] a, int x) {
		int l = 0;
		int r = n;
		while(r - l >= 1) {
			int i = (l + r) / 2;
			if(x <= a[i]) r = i;
			else l = i + 1;
		}
		return l;
	}

}
