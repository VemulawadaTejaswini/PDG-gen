import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {

		long K = in.nextInt();
		long sum = 0;
		for(int i=1;i<K+1;i++) {
			for (int j=1;j<K+1;j++) {
				for(int k=1;k<K+1;k++) {
					int a = gcd(i,j);
					sum += gcd(a, k);
				}
			}
		}

		System.out.println(sum);

	}

	public static int gcd(int a, int b) {
	    if (b == 0)
	        return a;

	    return gcd(b, a % b);
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}