
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        long N=gl();
        
        long min=N-1;
        long i=2;
        long k=N;
        while (i<=k) {
        	if(N%i==0) {
        		long a=i;
        		long b=N/i;
        		long c=a+b-2;
        		if (c<min) {
        			min=c;
        		}
        		k=b-1;
        	} else {
                k=Math.floorDiv(N,i)+1;
            }
        	i++;
        }
	    System.out.println(min);
	    
//        if (a>0) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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