import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    if(n % 111 == 0) {
		    	System.out.println(n);
		    }
		    else {
		    	System.out.println(n /111 * 111 + 111);
		    	
		    }
		    
		    sc.close(); }
}
