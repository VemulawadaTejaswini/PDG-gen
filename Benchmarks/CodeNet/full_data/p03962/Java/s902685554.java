import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a= gi();
	    int b= gi();
	    int c= gi();
        int d=3;
        if (a==b)d--;
        if (b==c)d--;
        if (c==a)d--;
        if(d==0)d++;
	    System.out.print(d);
	   
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