
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();

        //System.out.println("No");
        
        int c=0;
        for (int i=1; i<=n; i+=2) {
			if (yakusuC(i)==8) {
				c++;
			}
		}


        System.out.print(c);
	}
	
	public static int yakusuC(int n) {
		StringBuilder sb = new StringBuilder();
		int c=0;
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				c++;
			}
		}

		return c;
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