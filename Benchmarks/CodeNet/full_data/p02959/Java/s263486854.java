import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];
		
		for (int i = 0; i < n + 1; i++)a[i] = sc.nextInt();
		for (int i = 0; i < n; i++) b[i] = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < b[i]) {
				ans += a[i];
				b[i] -= a[i];
				if (b[i] < a[i + 1]) {
					ans += b[i];
					a[i + 1] -= b[i];
				}else {
					ans+=a[i+1];
				}
			} else {
				ans += b[i];
			}
		}
		System.out.println(ans);
    }
}