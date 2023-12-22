
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		a[n] = 0;
		int l = 0;
		int r = 0;
		int sum = 0;
		long ans = 0;
		while(l < n) {
			boolean flag = (sum + a[r]) == (sum ^ a[r]);
			if(r < n && flag) {
				sum += a[r];
				r++;
			} else {
				ans += r - l;
				sum -= a[l];
				l++;
			}
		}
		System.out.println(ans);
	}

}
