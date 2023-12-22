
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        String S=gs();
        int a=Integer.parseInt(S.substring(0, 1));
        int b=Integer.parseInt(S.substring(1, 2));
        int c=Integer.parseInt(S.substring(2, 3));
        int d=Integer.parseInt(S.substring(3, 4));
        
        for (int i=0; i< 8; i++) {
            int r = a;
            String sb="-";
            String sc="-";
            String sd="-";
            if((i>>0 & 1) == 0) {
            	r-=b;
            } else {
            	r+=b;
            	sb="+";
            }
            if((i>>1 & 1) == 0) {
            	r-=c;
            } else {
            	r+=c;
            	sc="+";
            }
            if((i>>2 & 1) == 0) {
            	r-=d;
            } else {
            	r+=d;
            	sd="+";
            }
            if(r==7) {
            	System.out.print(a+sb+b+sc+c+sd+d+"=7");
            	return;
            }
        }

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