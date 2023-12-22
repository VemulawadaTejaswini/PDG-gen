import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();

		int n = String.valueOf(s).length();

		int nn = n;

		long[] a = new long[n];

		for(int i=0;i<n;i++) {

			long p = (long)Math.pow(10, nn-1);

			a[i] = s/p;

			s %= p;

			nn--;
		}

		long min = 1000;

		for(int i=0;i<=n-3;i++) {

			long aa = a[i]*100 + a[i+1]*10 +a[i+2];

			long b = Math.abs(aa-753);

			if(min>b) min = b;
		}

		System.out.println(min);
	}

}
