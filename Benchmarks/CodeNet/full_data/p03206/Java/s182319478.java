import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int e= Math.abs(25-A);
	    
	    StringBuilder sb=new StringBuilder();
	    sb.append("Christmas");
	    for (int i=0; i<e;i++) {
	    	sb.append(" Eve");
	    }

        System.out.println(sb.toString());
//        if (a<=c&&c<=b) {
//        	System.out.print("Yes");
//        }else{
//        	System.out.print("No");
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
}