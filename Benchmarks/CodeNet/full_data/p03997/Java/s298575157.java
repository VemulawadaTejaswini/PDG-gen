import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// 入力
		final int a,b, h;
		try(Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();
			b = scan.nextInt();
			h = scan.nextInt();
		}
		//面積が整数になることは保障されている。
		int result = (a + b) * h / 2;
		
		// 出力
		try (PrintWriter out = new PrintWriter(System.out)) {
			out.println(result);
		}

	}

}
