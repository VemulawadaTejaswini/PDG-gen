import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int a=gi();
        int b=gi();
        int c=gi();
        int d=gi();
        
	    
	    
        //System.out.println((int)Math.ceil((double)h/(double)a));
        if (a+b>c+d) {
        	System.out.print("Left");
        }else if(a+b==c+d){
        	System.out.print("Balanced");
        }else {
        	System.out.print("Right");
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