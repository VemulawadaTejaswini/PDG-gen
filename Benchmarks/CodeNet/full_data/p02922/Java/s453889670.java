\import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int A = Integer.parseInt(stdin.next());
		int B = Integer.parseInt(stdin.next());
		int i;
		
		if(A == B) {
			System.out.println(1);
		}
		else {
			for(i=1;A*i-1<=B;i++);
			System.out.println(i);
		}
		out.flush();
	}

}
