
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    String S=gs();
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<S.length(); i++) {
        	char c=S.charAt(i);
        	char nc= (char)(((c+N-65)%26)+65);
        	sb.append(nc);
        }


        System.out.print(sb.toString());

//        if (N%2==0 && s.substring(0, N/2).equals(s.substring(N/2))) {
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
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