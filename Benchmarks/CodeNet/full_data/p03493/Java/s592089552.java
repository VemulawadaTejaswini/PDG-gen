import java.util.*;


public class Main{
	public static void main( String args[] ) {
		String input;
		int counter  = 0;
		Scanner scan = new Scanner( System.in);
		
		input = scan.next();
		
		
		
		for( int i = 0; i < input.length();  i++) {
			if( input.charAt(i) == '1') {
				counter++;
			}
		}
		
		
		System.out.println( counter );
		
		scan.close();
		
	}
}