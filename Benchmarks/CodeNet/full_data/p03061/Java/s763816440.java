import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int l[] = new int[n+1];
		int r[] = new int[n+1];
		l[0]=0;
		r[n]=0;
		for(int i=0; i<n; i++) {
			l[i+1] = gcd(a[i], l[i]);
		}
		for(int i=n-1; i>=0; i--) {
			r[i] = gcd(a[i], r[i+1]);
		}
		int max = -1;
		for(int i=0; i<n; i++) {
			max = Math.max(max, gcd(l[i], r[i+1]));
		}
		System.out.println(max);
		sc.close();
	}

	private int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
