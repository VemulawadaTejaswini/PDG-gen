import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];

		long ans = 0;
		int i;
		for(i = 0; i < n + 1; i++) {
			a[i] = scan.nextInt();
			ans += a[i];
		}
		for(i = 0; i < n; i++)
			b[i] = scan.nextInt();
		for(i = n - 1; i >= 0; i--) {
			int temp = b[i];
			if(a[i + 1] >= temp) {
				a[i + 1] -= temp;
			}else {
				int temp2 = temp - a[i + 1];
				a[i + 1] = 0;
				if(a[i] >= temp2) {
					a[i] -= temp2;
				}else {
					a[i] = 0;
				}
			}
		}
		for(i = 0; i < n + 1; i++) {
			ans -= a[i];
		}
		System.out.println(ans);
	}
}