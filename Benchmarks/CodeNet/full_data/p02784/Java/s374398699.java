
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int N=gi();
	    int[] A=new int[N];
	    int s=0;
	    for(int i=0; i<N;i++) {
	    	A[i]=gi();
	    	s+=A[i];
	    }	    
	    
       // System.out.print(sb.toString());

        if (s>=H) {
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

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}