

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        long N=gl();

        for (long h=1; h<=3500; h++) {
        	for (long n=1; n<=3500; n++) {
            	long l=1;
            	long r=3500;
            	while(r-l>1) {
            		long w=(l+r)/2;
            		long wl=4*h*n*w;
            		long wr=N*(n*w+h*w+h*n);
            		if(wl==wr) {
            			System.out.println(h + " " + n + " " + w);
            			return;
            		} else if(wl<wr) {
            			l=w;
            		} else {
            			r=w;
            		}

            	}
            }
        }

        //System.out.println(ans);
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