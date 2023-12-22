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
				int cnt = b[i] * (a[i] / b[i] + 1) - a[i];
				for(int j = i ; j >= 0 ; j--) {
					a[j] += cnt;
				}
//				System.out.println(cnt + " " + Arrays.toString(a));
				ans += cnt;
			}
		}
		System.out.println(ans);
	}
}
