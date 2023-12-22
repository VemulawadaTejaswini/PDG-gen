import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				pw.print(i<B^j<A ? "0" : "1");
			}
			pw.println();
		}
		
		sc.close();
		pw.close();
	}
}
