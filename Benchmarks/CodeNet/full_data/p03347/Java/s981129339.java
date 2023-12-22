import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		if(a[0] >= 1) {
			System.out.println(-1);
			return;
		}
		long ans = 0;
		for(int i = n - 1 ; i >= 0 ; i--) {
			if(n % 2 == 1 && i == 0) ans += a[0];
			else if(a[i - 1] < a[i]) {
				ans += a[i];
				i--;
			} else if(a[i - 1] == a[i]) {
				ans += a[i] + 1;
				i--;
			} else {
				ans += a[i - 1] + 1;
			}
		}
		System.out.println(ans);
	}
}
