import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int r=gi();
	    int g=gi();
	    int b=gi();



        //System.out.println(c);
        if (((r*100+g*10+b)%4) == 0) {
        	System.out.print("YES");
        }else{
            System.out.print("NO");
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