
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	Scanner w = new Scanner ( System.in) ;
	String s = w.next();;
	String t = w.next();
	int a = w.nextInt();
	
	int b = w.nextInt();
	
	String u = w.next();
	
	
	if (u == s) {
		a-=1;
	}
	else if (u ==t ) { 
		b-=1;
	}
	System.out.print(a + " "+ b);
	}
}
