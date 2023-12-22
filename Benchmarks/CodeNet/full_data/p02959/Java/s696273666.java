
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
		int aa[] = new int[n];
		int b[] = new int[n];
		for(int i=0; i<n+1; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			aa[i] = a[i]+a[i+1];
			b[i]=sc.nextInt();
		}
		int ans = 0;
		for(int i=0; i<n; i++) {
			int m = Math.min(aa[i], b[i]);
			ans += m;
			if(i<n-1) {
				aa[i+1] -= Math.max(0, (m-a[i]));
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
