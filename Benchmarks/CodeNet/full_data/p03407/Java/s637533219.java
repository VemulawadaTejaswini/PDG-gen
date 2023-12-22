import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    if (sc.nextInt() + sc.nextInt() >= sc.nextInt()) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}    
}	