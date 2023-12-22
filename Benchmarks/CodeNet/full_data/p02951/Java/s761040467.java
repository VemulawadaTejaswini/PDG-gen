import java.io.PrintWriter;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			
			int A = Integer.parseInt(stdin.next());
			int B = Integer.parseInt(stdin.next());
			int C = Integer.parseInt(stdin.next());

			if(C-(A-B)<0) {
				System.out.println(0);
			}
			else {
			System.out.println(C-(A-B));
			}
			
			out.flush();
	}
}


