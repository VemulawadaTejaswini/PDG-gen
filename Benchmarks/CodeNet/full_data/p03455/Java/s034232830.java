import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        mon1 solver = new mon1();
        solver.solve(1, in, out);
        out.close();
    }
    static class mon1 {
	    public void solve(int testNumber, Scanner in, PrintWriter out) {
	      int left = in.nextInt();
	      int right = in.nextInt();
	      
	      if (((left*right) % 2) != 0) {
	        out.println("odd");
	      } else {
	        out.println("even");
	      }
	    }
    }
}