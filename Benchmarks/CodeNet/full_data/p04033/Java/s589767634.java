
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long a=gl();
	    long b=gl();
       //System.out.print(min + " " + max);
//
        if (a>0) {
    	    System.out.print("Positive");
        }else if(b>=0){
        	 System.out.print("Zero");
        } else {
        	if((b-a)%2==0) {
        		System.out.print("Negative");
        	} else {
        		System.out.print("Positive");
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