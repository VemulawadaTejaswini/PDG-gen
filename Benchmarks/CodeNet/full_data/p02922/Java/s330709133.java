import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int A = Integer.parseInt(stdin.next());
		int B = Integer.parseInt(stdin.next());
		
		if(A%B != 0) {
			out.println((B/A)+1);
		}
		else {
			out.println(B/A);
		}
		
		out.flush();
	}

}
