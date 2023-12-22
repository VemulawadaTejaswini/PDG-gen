import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N= gi();
	    int K= gi();
	    int X= gi();
	    int Y= gi();

	    if (N <=K) {
            System.out.print(N*X);
	    } else {
	    	System.out.print(K*X+(N-K)*Y);
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