import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//String N = in.nextLine();
		double a = in.nextDouble();
		int b = (int)Math.sqrt(a);

		System.out.print(b*b);
	
		in.close();
	}
}