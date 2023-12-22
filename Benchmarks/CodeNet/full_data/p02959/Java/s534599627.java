
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n];
		for(int i=0; i<n+1; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i]=sc.nextInt();
		}
		long ans = 0;
		for(int i=0; i<n; i++) {
			int left = Math.min(a[i], b[i]);
			a[i] -= left;
			b[i] -= left;
			ans += left;
			int right = Math.min(a[i+1], b[i]);
			a[i+1] -= right;
			b[i] -= right;
			ans += right;
		}
		System.out.println(ans);
		sc.close();
	}
}
