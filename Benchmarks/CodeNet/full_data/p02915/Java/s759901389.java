import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		
		out.println(N*N*N);
		out.flush();
	}
	
}