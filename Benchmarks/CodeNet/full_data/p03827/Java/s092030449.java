import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    String s=gs();
	int x=0;
	int max=0;
	    for (int i=0; i<n;i++) {
		    char c=s.charAt(i);
		    if(c=='I') {
		    	x++;
		    	if (max<x) {
		    		max=x;
		    	}
		    }else {
		    	x--;
		    }
	    }

	    	System.out.println(max);
	    
        //System.out.println(e);
//        if (xo>w || yo>h) {
//        	System.out.print(0);
//        }else {
//        	System.out.print((h-yo)*(w-xo));
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