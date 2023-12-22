
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        double[] A=new double[N];
        double s=0;
        for (int i=0;i<N;i++) {
        	A[i]=gd();
        	s+=A[i];
        }
        double m=s/N;
        
        double mk=Double.MAX_VALUE;
        int min=0;
        for (int i=0;i<N;i++) {
        	double k=Math.abs(m-A[i]);
        	if(k<mk) {
        		mk=k;
        		min=i;
        	}
        }
        System.out.print(min);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


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