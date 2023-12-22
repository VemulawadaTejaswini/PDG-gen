import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[200000];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt() - 1;
		for(int i = 0 ; i < n ; i++) {
			b[a[i]]++;
		}
		Arrays.sort(b);
		int ans = 0;
		for(int i = 199999 - k ; i >= 0 ; i--) {
			ans += b[i];
		}
		System.out.println(ans);

	}
}
