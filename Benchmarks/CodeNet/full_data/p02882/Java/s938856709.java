import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double x = Double.parseDouble(sc.next());
		
		double ins = (2*a*a*b - 2*x) / (a*a*a);
		double theta = Math.atan(ins);
		theta = Math.toDegrees(theta);
		out.println(theta);

		out.flush();
	}
}