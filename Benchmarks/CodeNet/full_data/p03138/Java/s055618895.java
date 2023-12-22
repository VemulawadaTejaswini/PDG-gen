
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
		}
		int b[] = new int[40];
		for(int i=0; i<n; i++) {
			for(int j=0; j<40; j++) {
				b[j] += (a[i]>>j)&1;
			}
		}

		long x = 0;
		for(int i=0; i<40; i++) {
			if(b[i]*2<n && (x + (1L<<i)) <= k) {
				x += (1L<<i);
			}
		}

		long ans = 0;
		for(int i=0; i<n; i++) {
			ans += (a[i] ^ x);
		}
		System.out.println(ans);

		sc.close();
	}

}
