import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double c = Double.parseDouble(sc.next());
		
		String ans = "No";
		
		double d = a * b;
		double e = (c - a - b) / 2;
			   e = e * e;
		
		
		if(d   < e) {
			ans = "yes";
		}
		System.out.println(ans);
		
	}
}