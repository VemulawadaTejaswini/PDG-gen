
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	long p[];
	long b[];
	long a[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();

		p = new long[51];
		b = new long[51];
		a = new long[51];
		p[0]=1;
		b[0]=0;
		a[0]=1;
		for(int i=0; i<50; i++) {
			p[i+1] = 2 * p[i] + 1;
			b[i+1] = 2 * b[i] + 2;
			a[i+1] = p[i+1]+b[i+1];
		}

		long ans = f(n, x);
		System.out.println(ans);
		sc.close();
	}

	long f(int n, long x) {
		if(n==0) {
			if(x<=0) return 0;
			else return 1;
		}
		if(a[n-1] +1 >= x) {
			return f(n-1, x-1);
		}
		else if(a[n-1] +2 == x) {
			return p[n-1] + 1;
		}
		else if( a[n-1] + 2 < x && x < a[n]) {
			return p[n-1] + 1 + f(n-1, x-a[n-1]-2);
		}
		else {
			return p[n];
		}
	}
}
