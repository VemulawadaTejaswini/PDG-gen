
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long q=gl();
	    long h=gl();
	    long s=gl();
	    long d=gl();
	    long n=gl();
	    q=q*4;
	    h=h*2;
	    long m=Math.min(Math.min(q, h), s);

        if(2*m<=d) {
		    System.out.println(m*n);
        } else if(n%2==0) {
        	System.out.println(d*n/2);
        } else {
        	System.out.println(d*(n-1)/2 + m);
        }
	}

	 // ユークリッドの互除法
    public static long uclid(long m, long n) {
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
	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}