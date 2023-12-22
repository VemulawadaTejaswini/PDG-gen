import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int x=gi();
	    int y=gi();
	    
	    int xa =0;
	    int ya =0;
	    if (x==2) {
	    	xa=1;
	    } else if (x==4 || x==6 || x==9 || x==11) {
	    	xa=2;
	    }
	    
	    if (y==2) {
	    	ya=1;
	    } else if (y==4 || y==6 || y==9 || y==11) {
	    	ya=2;
	    }


        //System.out.println(c);
        if (xa==ya) {
        	System.out.print("Yes");
        }else{
            System.out.print("No");
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
}