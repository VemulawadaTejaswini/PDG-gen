import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long L=gl();
	    long R=gl();
	    
        if (R-L > 2019) {
	        System.out.println(0);
	        return;
        }
        
        long min=2018;
        for (long i=L; i<=R; i++) {
        	for (long j=i+1; j<=R; j++) {
        		long a=(i*j)%2019;
        		if (a<min) {
        			min=a;
        		}
        	}
        }
        
        System.out.println(min);

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
}