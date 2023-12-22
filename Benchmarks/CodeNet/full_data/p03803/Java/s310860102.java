import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a= gi();
	    int b= gi();



        //System.out.print(Math.max(a*b, c*d));
        if (a==b) {
        	System.out.print("Draw");
        }else if(a==1){
        	System.out.print("Alice");
        }else if(b==1){
        	System.out.print("Bob");
        }else if(a>b){
        	System.out.print("Alice");
        }else{
        	System.out.print("Bob");
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