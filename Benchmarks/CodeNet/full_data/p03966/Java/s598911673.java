
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    long[] T=new long[N];
	    long[] A=new long[N];

        for (int i=0; i<N; i++) {
        	T[i]=gl();
        	A[i]=gl();
        }

        long ht=1;
        long ha=1;
        for (int i=0; i<N; i++) {
            long hi=(long)Math.max(Math.ceil((double)ht/(double)T[i]), Math.ceil((double)ha/(double)A[i]));
            ht=hi*T[i];
            ha=hi*A[i];
        }

        System.out.println((long)(ht+ha));

//        if(ans==0) {
//
//		    System.out.println("Yes");
//        } else {
//        	System.out.println("No");
//
//        }
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