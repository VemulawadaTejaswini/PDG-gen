import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
        int a=0;
        for(int i=1; i<=S.length();i++) {
        	String S2=S.substring(0,S.length()-i);
        	if (S2.length()%2==0) {
        		if(S2.substring(0, S2.length()/2).equals(S2.substring(S2.length()/2, S2.length()))) {
        			a=S2.length();
        			break;
        		}
        	}
        }

	   
	    System.out.print(a);

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