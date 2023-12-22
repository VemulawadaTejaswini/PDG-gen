import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double aa = Math.sqrt(a);
		double bb = Math.sqrt(b);
		double cc = Math.sqrt(c);
		if((double)(aa + bb) < cc) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
} 
