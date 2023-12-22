
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] time = new long[n];
		long[] c = new long[n];
		long[] s = new long[n];
		long[] f = new long[n];
		for(int i = 0; i < n; i++) {
			time[i] = 0;
		}
		for(int i = 0; i < n - 1; i++) {
			c[i] = sc.nextLong();
			s[i] = sc.nextLong();
			f[i] = sc.nextLong();
		}
		for(int i = n - 2; i > -1; i--) {
			long ans = s[i] + c[i];
			for(int j = i + 1; j < n - 1; j++) {
				if(ans <= s[j]) {
					ans = time[j];
					break;
				} else {
					if(ans % f[j] != 0)
						ans += f[j] - ans % f[j];
					ans += c[j];
				}
			}
			time[i] = ans;
		}
		for(int i = 0; i < n; i++) {
			System.out.println(time[i]);
		}

	}

}
