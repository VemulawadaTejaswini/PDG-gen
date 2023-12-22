import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
	static int n;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
		}
		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(c);
		for(int i  = 0 ; i < n ; i++) {
			ans += 0L + binary_search(a, b[i]) *(n -  binary_search2(c, b[i] + 1));
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