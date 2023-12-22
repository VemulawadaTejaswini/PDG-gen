
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
		long ans = a[0];
		for(int i=1; i<n; i++) {
			ans = lcm(ans, a[i]);
		}
		System.out.println(ans);
		sc.close();
	}

	private long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		long ans = gcd(b, a%b);
		return ans;
	}

	private long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

}
