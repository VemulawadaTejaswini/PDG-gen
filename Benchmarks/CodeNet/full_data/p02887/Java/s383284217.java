import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String S= gs();
	    
	    char bc= S.charAt(0);
	    int n=1;
        for (int i=0; i<S.length(); i++) {
        	char c=S.charAt(i);
        	if (c!=bc) {
        		n++;
        		bc=c;
        	}
        }


        System.out.print(n);
        

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