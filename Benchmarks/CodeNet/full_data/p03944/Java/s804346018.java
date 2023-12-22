import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int w=gi();
	    int h=gi();
	    int n=gi();
	    int xo=0;
	    int yo=0;
	    
	    for (int i=0; i<n;i++) {
	    	int x=gi();
	    	int y=gi();
	    	int a=gi();
	    	if (a==1) {
	    		xo=Math.max(xo,x);
	    	} else if (a==2) {
	    		w=Math.min(w, x);
	    	} else if (a==3) {
	    		yo=Math.max(yo, y);
	    	} else if (a==4) {
	    		h=Math.min(h,y);
	    	}
	    }

        //System.out.println(n.length()-n.replaceAll("1", "").length());
        if (xo>w || yo>h) {
        	System.out.print(0);
        }else {
        	System.out.print((h-yo)*(w-xo));
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