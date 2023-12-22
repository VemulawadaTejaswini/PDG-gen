import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int[] t= new int[n];
	    
	    int s=0;
	    for (int i=0; i<n;i++) {
	    	t[i]=gi();
	    	s+=t[i];
	    }
	    
	    int m= gi();
	    for (int i=0; i<m;i++) {
	    	int p =gi();
	    	int x= gi();
	    	System.out.println(s -t[p] + x);
	    }
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