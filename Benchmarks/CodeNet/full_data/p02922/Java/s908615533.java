import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String A = in.next();
		String B = in.next();
		
		in.close();
		
		double ans = (Double.parseDouble(B) - 1)/(Double.parseDouble(A) - 1);
		
		System.out.println(Math.ceil(ans));
	}
	
}