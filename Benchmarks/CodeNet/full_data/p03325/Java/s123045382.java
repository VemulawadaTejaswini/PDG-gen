
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
		}

		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += f(a[i]);
		}
		System.out.println(ans);
		sc.close();
	}

	private int f(long x) {
		int res = 0;
		while(x%2 == 0) {
			res++;
			x/=2;
		}
		return res;
	}
}
