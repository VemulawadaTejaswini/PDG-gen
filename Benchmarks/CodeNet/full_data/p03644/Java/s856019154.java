import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();

	    int m= 1;
	    
int i=0;
           while(true) {
        	   if(Math.pow(2, i)<=N) {
        		   m=(int)Math.pow(2, i);
        		   i++;
        	   }else {
        		   break;
        	   }
           }


	   
	    System.out.print(m);

//        if (t.equals("Sunny")) {
//        	System.out.print("Cloudy");
//        }else if(t.equals("Cloudy")){
//        	System.out.print("Rainy");
//        } else {
//        	System.out.print("Sunny");
//        }


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