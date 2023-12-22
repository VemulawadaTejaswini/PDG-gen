import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[200100];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			b[--a[i]]++;
		}
		Arrays.sort(b);
		long ans = 0;
		for(int i = 0 ; i < n - k ; i++) {
			ans += b[200099 - k - i];
		}
		System.out.println(ans);
	}
}
