import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = n - 1 ; i >= 0 ; i--) {
			if(a[i] % b[i] != 0 || a[i] == 0) {
				ans += ((a[i] + ans) / b[i] + 1) * b[i] - (a[i] + ans);
			}
		}
		System.out.println(ans);
	}
}
