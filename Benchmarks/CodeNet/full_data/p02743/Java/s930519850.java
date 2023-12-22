
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		long d = (long)c - a  - b;
		long e =(long) a * b;
		
		long f = (long)Math.pow(d, 2);
		
		if(f > 4*e && d > 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
