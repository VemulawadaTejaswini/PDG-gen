
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long X=gl();
	    long Y=gl();

        //System.out.println(sb.toString());
        if (X%Y==0) {
        	System.out.print("-1");
        }else{
        	long c=1;
        	while(true) {
        		if (((X*c) %Y) != 0) {
        			System.out.print(X*c);
        			return;
        		}
        		c++;
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
}