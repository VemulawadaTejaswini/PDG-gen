import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final int n;	// 1≦N≦100
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
		}
		
		int result = n * (n + 1) /2;
		
		// 出力
		out.println(result);
		out.close();
	}

}
