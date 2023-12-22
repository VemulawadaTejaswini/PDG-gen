import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    int b=gi();
	    int c=gi();



        System.out.println(Math.min(Math.min(a+b, b+c), c+a));
//        if (b-a<=0) {
//        	System.out.print(Math.);
//        }else if (b-a>x){
//            System.out.print("dangerous");
//        } else {
//        	System.out.print("safe");
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