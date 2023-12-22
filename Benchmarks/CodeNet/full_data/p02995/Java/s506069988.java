import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    long A=Long.parseLong(scanner.next());
	    long B=Long.parseLong(scanner.next());
	    long C=Long.parseLong(scanner.next());
	    long D=Long.parseLong(scanner.next());

	    long ax= Math.floorDiv(A,C);
	    long bx= Math.floorDiv(B,C);
	    long ay= Math.floorDiv(A,D);
	    long by= Math.floorDiv(B,D);

	    long cd = C * D / f(C, D);
        long az=Math.floorDiv(A,cd);
        long bz=Math.floorDiv(B,cd);

        long ac= A-ax-ay+az;
        long bc= B-bx-by+bz;
        long c=bc-ac;
        if ((A%C)!=0 && (A%D)!=0)c++;
	    System.out.println(c);

	}

	public static long f(long m, long n) {
		if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			long t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
	}
}