import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int b = (n-1) % 2;
		int ans = 0;
		for(int i = n-1; i >= 0; i--) {
			if(i % 2 == b) {
				ans += a[i];
			}else {
				ans -= a[i];
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}