import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    long X = Long.parseLong(scanner.next());
	    long[] Y = new long[N];

	    for (int i=0; i<N; i++) {
	    	Y[i] = Math.abs(X - Long.parseLong(scanner.next()));
	    }

	    long a=Y[0];
	    for (int i=1; i<N; i++) {
	    	a=f(a,Y[i]);
	    }
        System.out.print(a);
	}

	public static long f(long m, long n) {
		if (m<n) {
			m= m^n;
			n=m^n;
			m=m^n;
		}

		while (m%n==0) {
		     long t = m%n;
		     m=n;
		     n=t;
		}

		return n;
	}

}