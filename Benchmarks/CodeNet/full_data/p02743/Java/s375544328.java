/* Click on the checkbox for Add Custom Input and then write the input there before running the program */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    long a = input.nextLong();
	    long b = input.nextLong();
	    long c = input.nextLong();
	    
	    if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c))
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
}