import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		if(n==2) {
			System.out.println(Math.max(a[0], a[1]));
		} else {
			int[] b = new int[n];
			b[1] = a[0];
			for(i=2; i < n; i++) {
				b[i] = gcd(b[i-1], a[i-1]);
			}
			int[] c = new int[n];
			c[n-2] = a[n-1];
			for(i=n-3; i >= 0; i--) {
				c[i] = gcd(c[i+1], a[i+1]);
			}
			b[0] = c[0];
			c[n-1] = b[n-1];
			int max = 1;
			int pre;
			for(i=0; i < n; i++) {
//				System.out.println("b,c=" + b[i] + "," + c[i]);
				pre = gcd(b[i], c[i]);
				if(pre>max)max=pre;
			}
			System.out.println(max);
		}
	}
	public static int gcd(int a, int b) {
		int t;
		while((t=a%b)!=0) {
			a = b;
			b = t;
		}
		return b;
	}
}
