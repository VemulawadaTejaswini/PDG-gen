
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
        String[] you = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	    String s=gs();
	    //int b=gi();
	    
	    for(int i=0; i< you.length;i++) {
	    	if(s.equals(you[i])) {
	    		 System.out.print(7-i);
	    		 return;
	    	}
	    }


	    //System.out.print(s);

//        if (a<10 && b<10) {
//        	System.out.print(a*b);
//        } else {
//        	System.out.print(-1);
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